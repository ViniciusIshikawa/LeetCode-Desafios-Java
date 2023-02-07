package application;
 
import java.util.HashMap;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		System.out.println(validParentheses("(){})]")); 
 	}
	
	public static boolean validParentheses(String parenteses) {
		HashMap<Character,Character> dicionario = new HashMap<>();
		
		dicionario.put(')', '(');
		dicionario.put(']', '[');
		dicionario.put('}', '{');
		
		Stack<Character> pilha = new Stack<>();
		
		for(int idx = 0; idx < parenteses.length(); idx++) {
			//verifica se foi aberto algum parênteses e adiciona na pilha.
			if(parenteses.charAt(idx) == '(' || parenteses.charAt(idx) == '[' || parenteses.charAt(idx) == '{') {
				pilha.push(parenteses.charAt(idx));
				
				//pula o resto e passa para o próximo indice. 
				continue;
			}
			
			//Se não existe nada na pilha ou o parênteses aberto não foi fechado, para tudo e retorna false.
			//pilha.pop() retorna o primeiro valor da pilha e em seguido o remove.
 			if(pilha.size() == 0 || dicionario.get(parenteses.charAt(idx)) != pilha.pop()) {
				return false;
			}
		}
		
		//Se o tamanho da pilha for 0, todos os parênteses estão corretos.
		if(pilha.size() == 0) {
			return true;
		}
		
		return false;
	}

}

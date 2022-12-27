import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.next().toUpperCase();
		
	    String previousRomanNumber = "";
		int number = 0, previousNumber = 0, total = 0;
        String[]romanNumber = s.split("");
        Boolean firstNumber = true;
        
        for(int i = 0; i < romanNumber.length; i++) {  
        	previousNumber = number; 
        	
	        switch(romanNumber[i]){
	            case "I": 
	                number = 1;
	                break;
	            
	            case "V": 
	                number = 5;
	                break;
	
	            case "X": 
	                number = 10;
	                break;
	                
	            case "L": 
	                number = 50;
	                break;
	                
	            case "C": 
	                number = 100;
	                break;
	                
	            case "D": 
	                number = 500;
	                break;
	                
	            case "M": 
	                number = 1000;
	                break;
	        }
	        
	        if(!firstNumber) {
	        	previousRomanNumber = romanNumber[i -1];
	        	
	        	switch(previousRomanNumber + romanNumber[i]) {
	        		case "IV": 
	        			total = (total + 4) - previousNumber;
	        			break;
	        			
	        		case "IX": 
	        			total = (total + 9) - previousNumber;
	        			break;
	        			
	        		case "XL": 
	        			total = (total + 40) - previousNumber;
	        			break;
	        			
	        		case "XC": 
	        			total = (total + 90) - previousNumber;
	        			break;
	        			
	        		case "CD": 
	        			total = (total + 400) - previousNumber;
	        			break;
	        			
	        		case "CM": 
	        			total = (total + 900) - previousNumber;
	        			break;
	        			
	        		default: 
	        			total += number;
	        			break;
	        	}
	        	
	        } else {
	        	firstNumber = false;
	        	previousRomanNumber = romanNumber[i];
	        	total = number;
	        }
        }
        
        System.out.println(total);
	}
}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Number: ");
		int originalNumber = reader.nextInt();
		String reverseNumber = new StringBuilder(Integer.toString(originalNumber)).reverse().toString();
		
		if(reverseNumber.equals(Integer.toString(originalNumber).trim())) {
			System.out.println("The number: " + Integer.toString(originalNumber) + " is palindrome");
		} else {
			System.out.println("The number: " + Integer.toString(originalNumber) + " is not palindrome");
		}

	}

}

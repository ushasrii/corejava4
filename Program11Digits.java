package ai.dv.ui.as;
import java.util.Scanner;
public class Program11PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter digits: ");
		String input  = scan.next();
		scan.close();
		for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            switch(digit) {
            	case '1': 	System.out.print("One ");
							break;
            	case '2': 	System.out.print("Two ");
            				break;
            	case '3': 	System.out.print("Three ");
							break;
            	case '4': 	System.out.print("Four ");
            				break;
            	case '5': 	System.out.print("Five ");
            				break;
            	case '6': 	System.out.print("Six ");
            				break;
            	case '7': 	System.out.print("Seven ");
							break;
            	case '8': 	System.out.print("Eight ");
							break;
            	case '9': 	System.out.print("Nine ");
            				break;
            	default:    System.out.println("Unknown Number");
            				break;
            }
		}
		
	}

}

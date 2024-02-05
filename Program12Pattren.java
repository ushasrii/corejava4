package ai.dv.ui.as;
import java.util.Scanner;
public class Program12Pattren {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		scan.close();
		for(int row=1;row<=number;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

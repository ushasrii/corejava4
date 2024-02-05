package ai.dv.ui.as;
import java.util.Scanner;

public class Program13PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        scan.close();
        int num = number / 2;
        int flag = 0;

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (int i = 2; i <= num; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(number + " is not a prime number.");
            } else {
                System.out.println(number + " is a prime number.");
            }
        }
    }
}

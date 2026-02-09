package Mypackage;
import java.util.Scanner;

public class PrimeNumbeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;
        boolean isPrime;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Prime numbers from 0 to " + n + ":");

        for (i = 2; i <= n; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

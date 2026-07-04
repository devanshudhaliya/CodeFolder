package Moderate;

import java.util.*;

public class PrintPrime {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(num);

        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

package Moderate;

import java.util.*;

public class IsPrime {

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

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if (isPrime(a)) {
            System.out.println("{ Given number is a PRIME number }");
        } else {
            System.out.println("{ Given number isn't a prime number }");
        }

        sc.close();
    }
}
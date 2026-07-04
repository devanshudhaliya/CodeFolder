import java.util.*;

public class ProgTwo {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter first number : ");
        int b = sc.nextInt();
        int temp;
        System.out.print("IF you want to swap numbers enter Y else N  : ");
        char val = Character.toUpperCase(sc.next().charAt(0));

        if (val == 'Y') {
            temp = a;
            a = b;
            b = temp;
            System.out.println("After Swaping numbers you got");
            System.out.println("First number : " + a + " Second number : " + b);
        }
            System.out.println("Without Swaping numbers you got");
        System.out.println("First number : " + a + " Second number : " + b);
        sc.close();;
    }
}

import java.util.Scanner;

public class LargestInthree{
    public static void theLargest(int a , int b ,int c){
        if(a > b && a > c){
            System.out.print("First number "+a+" is the greatest number in three ");
        }else if(b > a && b > c){
            System.out.print("Second number "+b+" is the greatest number in three ");
        }else{
            System.out.print("Third number "+c+" is the greatest number in three ");
        }
    }

    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        theLargest(a,b,c);
        sc.close();
    }
}
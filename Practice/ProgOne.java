import java.util.Scanner;

public class ProgOne{

    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = sc.nextLine();
        System.out.print("Enter you age : ");
        int age = sc.nextInt();
        System.out.print("Enter you city : ");
        String city = sc.next();
        System.out.println("Your name : "+name);
        System.out.println("Your age  : "+age);
        System.out.println("Your city : "+city);
        sc.close();
        }
}
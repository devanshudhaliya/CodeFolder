import java.util.*;

public class LargestNum{
    public static void isLargest(int a,int b){
        if(a >  b){
            System.out.println("Number : "+a+" is the gratest ");
        }
        else if( b > a){
            System.out.println("Number : "+b+" is the gratest ");
        }else {
            System.out.println("Number "+a+" and "+b+" are equal ");
        }
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
         
        isLargest(a , b);
        sc.close();
    }
}
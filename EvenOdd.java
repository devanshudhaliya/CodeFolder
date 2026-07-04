import java.util.*;

public class EvenOdd{
    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number you wanna check is even or odd : ");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println(" { Given number is odd 'EVEN' } ");
        }
        else{
            System.out.println(" { Given number is 'ODD' } ");
        }
        sc.close();
    }
}
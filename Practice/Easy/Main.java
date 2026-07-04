import java.util.*;

public class Main{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0; i < a;i++){
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        System.out.println(sum);
        sc.close();
    }
}
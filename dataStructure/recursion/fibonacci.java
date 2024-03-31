
import java.util.Scanner;

public class fibonacci {
    public static long fibonacci(long n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String [] args){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}

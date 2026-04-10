import java.util.*;

public class Fibonacci_01 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n to calculate n th fibonacci : ");
        int n = sc.nextInt();
        System.out.println("The fibonacci of '"+n+"' is : "+fib(n));
    }


    public static int fib(int n) {
        if (n==0 || n==1){
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
        
    }
    
}

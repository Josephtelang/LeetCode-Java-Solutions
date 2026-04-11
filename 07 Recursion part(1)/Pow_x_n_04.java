
// Problem: Pow (x,n)
// leetCode: 50        Google, Amazon
// Difficulty: medium
// Time Complexity: O(log n)
// Space Complexity: O(log n)
public class Pow_x_n_04 {

    public static void main(String arg[]){
        System.out.println(myPow(2.0,-2));
    }


    public static double myPow(double x, int n) {
        return helper(x,n);

    }

    private static double helper(double x, long n){
         if (n==1){
            return x;
        }
        
        if (n==0){
            return 1;
        }
        if(n <=0){
            return 1/helper(x,-n);
        }
    

        double halfPower = helper(x,n/2);
        double halfPowerSquare = halfPower * halfPower;

        //odd
        if(n%2 !=0){
            halfPowerSquare = x*halfPowerSquare;
        }

        return halfPowerSquare;
       }
}

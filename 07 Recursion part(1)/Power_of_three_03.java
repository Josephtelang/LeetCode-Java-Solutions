
// Problem: Power of Three
// leetCode: 326
// Difficulty: easy
// Time Complexity: O(log n)
// Space Complexity: O(log n))
public class Power_of_three_03 {

    public static void main(String arg[]){
        System.out.println(isPowerOfThree(27));

    }

    public static boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n==0 || n%3!=0 ){
            return false;
        }


        int reminder = n/3;
        return isPowerOfThree(reminder);

    }
    
}

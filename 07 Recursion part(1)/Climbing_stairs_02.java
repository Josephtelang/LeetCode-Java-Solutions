import java.util.*;
// Problem: Climbing Stairs
// leetCode: 70
// Difficulty: easy
// Time Complexity: O(2^n) -> for leet code we need O(n) using Dynamic programming
// Space Complexity: O(n)

public class Climbing_stairs_02 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth stairs : ");
        int n = sc.nextInt();
        System.out.println("The number of way for climbing the '"+n+"th'stair is : "+climbStairs(n));        

    }
    
    public static int climbStairs(int n) {
        if (n == 1 || n==2){
            return n;
        }

        int ways = climbStairs(n-1)+ climbStairs(n-2);
        return ways;
        
    }

    
}

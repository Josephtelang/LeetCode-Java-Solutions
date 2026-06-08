// Problem: is Palindrome
// leetCode: 125
// Difficulty: easy
// Time Complexity:  n/2 × O(1) = O(n)
// Space Complexity:   O(n)

public class Is_Palindrome_02 {
    public static void main(String arg[]){
        String str= "abba";
        System.out.println("is it palindrome : "+isPalindrome1(str, 0, str.length()-1));

    }

    public static boolean isPalindrome1(String s, int left, int right){
        //base case
        if(left>=right){
            return true;
        }

        if(!Character.isLetterOrDigit(s.charAt(left))){
            return isPalindrome1(s,left+1,right);
        }

        if(!Character.isLetterOrDigit(s.charAt(right))){
            return isPalindrome1(s,left,right-1);
        }

        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }

        return isPalindrome1(s,left+1,right-1);
    }
    
}

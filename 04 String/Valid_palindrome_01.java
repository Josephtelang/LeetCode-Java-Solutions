// Problem: Valid palindrome
// Difficulty: easy
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Valid_palindrome_01 {
    public static void main(String arg[]){
        String str = "A man, a plan, a canal: Panama";

        System.out.println("Is it palindorme : "+isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;


        while(i<=j){
            
            while(i<j && Character.isLetterOrDigit(s.charAt(i))==false){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            
            i++;
            j--;
            
            

        }
        return true;
    }
    
}

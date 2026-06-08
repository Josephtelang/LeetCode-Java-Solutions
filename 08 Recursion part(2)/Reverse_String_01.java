// Problem: Reverse String
// leetCode: 344
// Difficulty: easy
// Time Complexity:  n/2 × O(1) = O(n)
// Space Complexity:  n/2 = O(n)

public class Reverse_String_01 {
    public static void main(String arg[]){
        char s[] = {'h','e','l','l','o'};
        reverseString(s, 0, s.length-1);
        System.out.println(s);

    }
    
    public static void reverseString(char s[],int left , int right){
        // base case
        if(left>=right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseString(s,left+1,right-1);

    }
    
}

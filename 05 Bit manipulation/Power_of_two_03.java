public class Power_of_two_03 {
    public static void main(String arg[]){
        System.out.println("Is n power of 2 : "+isPowerOfTwo(4));
    }
    public static boolean isPowerOfTwo(int n) {
        // return n>0 ? (n & (n-1)) == 0 : false ;

                    // Or
        return (n>0) && (n & (n-1)) ==0;
        
    }
    
}

import java.util.Arrays;

public class Sort_an_array{
    public static void main(String arg[]){
        int arr[] = {5,1,1,2,0,0};
        // System.out.println(Arrays.toString(bubble_Sort(arr)));
        // System.out.println(Arrays.toString(selection_Sort(arr)));
        // System.out.println(Arrays.toString(insertion_Sort(arr)));
        System.out.println(Arrays.toString(counting_Sort(arr)));
    }

    public static int[] bubble_Sort(int[] nums) {
        int n = nums.length;
        for(int i =0 ; i<n-1 ; i++){
            int swap = 0;
            for (int j=0 ; j< n-1-i ; j++){
                if (nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap ++;
                }
            }
            if (swap ==0){
                break;
            }
        }

        return nums;

        
        
    }
    public static int[] selection_Sort(int[] nums) {
        int n = nums.length;
        for (int i =0 ; i<n ; i++){
            int minpos = i;

            for (int j = i+1 ; j<n ; j++){
                if (nums[minpos] < nums[j]){
                    minpos = j;

                }
            }
            int temp = nums[i];
            nums[i]  = nums[minpos];
            nums[minpos] = temp;

        }
        return nums;
    }

    public static int[] insertion_Sort(int[] nums) {
        int n = nums.length;
        for ( int i=1 ; i<n ; i++){
            // int count = i-1;
            int curr_num = nums[i];

            int j=i-1;
            while (j>=0 && curr_num > nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = curr_num;
            
         
        }

        
        return nums;
    }

    public static int[] counting_Sort(int[] nums) {
        int n = nums.length;
        int max_range = Integer.MIN_VALUE;

        for (int i =0 ; i<n ; i++){
            max_range = Math.max(max_range,nums[i]);
        }

        int Aux_arr[] = new int[max_range+1];
        for (int i =0 ; i<n ; i++ ){
            Aux_arr[nums[i]]++;
        }
        
        int count = 0;
        for (int i = max_range ; i>=0 ; i--){
            while(Aux_arr[i] != 0) {
                nums[count++] = i;
                Aux_arr[i]--;
            }

        }


        
    return nums;
    }
        
}
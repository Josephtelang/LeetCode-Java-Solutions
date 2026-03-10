// Problem: best_time_to_buy_and_sell
// Difficulty: easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Best_time_to_buy_and_sell {
    public static void main(String arg[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("The max profit is : "+maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int n = prices.length;  
       

        for (int i=0; i<n ;i++){
            int selling_price = prices[i];
            
            if (min_price < selling_price){
                int profit = selling_price - min_price;
                max_profit = Math.max(profit,max_profit);
            }
            else{
                min_price = selling_price;
            }
        }
        return max_profit;
        
        
    }
}
// Problem: Mini Stack 
// leetCode: 705
// Difficulty: Medium
// Time Complexity: O(1)
// Space Complexity: O(n)

public class Mini_stack_03 {
    public static void main(String arg[]){
        MinStack obj = new MinStack();
        obj.push(5);
        obj.pop();
        obj.push(6);
        obj.push(3);
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println("The top element : "+param_3);
        System.out.println("The getMin element : "+param_4);
    }

    
}
class MinStack {
    int array_miniStack[];
    int array_mainStack[];
    int top_main;
    int top_mini;

    public MinStack() {
        this.array_mainStack = new int[30000];
        this.array_miniStack = new int[30000];
        this.top_main = -1;
        this.top_mini = -1;

        
    }
    
    public void push(int val) {
        this.top_main++;
        if (this.top_mini ==-1){
            this.top_mini ++;
            this.array_miniStack[this.top_mini] = val;
        }
        else if(this.top_mini >= 0){
            this.top_mini++;
            if( this.array_miniStack[this.top_mini-1] >= val){

                this.array_miniStack[this.top_mini] = val;

            }
            else{
                this.top_mini--;
            }
        }
        
        this.array_mainStack[this.top_main] = val;
        
    }
    
    public void pop() {
        if (this.top_mini>=0 && this.top_main>=0){
            if (this.array_mainStack[this.top_main]== this.array_miniStack[this.top_mini]){
                this.array_miniStack[this.top_mini] =0;
                this.top_mini--;
            }
            this.array_mainStack[this.top_main] = 0;
            this.top_main--;
        }

        
    }
    
    public int top() {
        return this.array_mainStack[this.top_main];

        
    }
    
    public int getMin() {
        return this.array_miniStack[this.top_mini];
        
    }
}


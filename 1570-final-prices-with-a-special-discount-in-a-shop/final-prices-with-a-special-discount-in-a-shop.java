class Solution {
    public int[] finalPrices(int[] prices) {
        int n= prices.length;
        int[] res= new int[n];
        Stack<Integer> stk= new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && prices[i]<stk.peek()){
                stk.pop();
            }
            res[i]= prices[i]- (stk.isEmpty()?0:stk.peek());
            stk.push(prices[i]);
        }
        return res;
    }
}
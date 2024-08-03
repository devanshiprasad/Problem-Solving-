class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        Stack<Integer> stk= new Stack<>();
        for(int i=n-1;i>=0;i--){
            stk.push(i);
        }
        for(int i=n-1;i>=0;i--){
            res[i]=-1;
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i]=nums[stk.peek()];
            }
            stk.add(i);
        }
        return res;
    }
}
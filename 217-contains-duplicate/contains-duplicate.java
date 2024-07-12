class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c= nums[i];
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c, map.get(c)+1);
                count++;
            }
            if(count>0){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()> nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
           }
}
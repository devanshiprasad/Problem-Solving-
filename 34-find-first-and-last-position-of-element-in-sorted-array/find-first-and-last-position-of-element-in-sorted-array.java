class Solution {
    public int first(int[]nums, int target){
        int low=0;
        int high=nums.length-1;
        int i=-1;
        while(low<=high){
            int mid= low+ (high-low)/2;
            if(nums[mid]>=target){
                  high= mid-1;
            }
            else{
                low=mid+1;
            }
            if(nums[mid]==target){
                i=mid;
            }
        }
        return i;
    }

    public int last(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        int i=-1;
        while(low<=high){
            int mid= low+ (high-low)/2;
            if(target>=nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            if(target==nums[mid]){
                i=mid;
            }
        }
        return i;
    }


    public int[] searchRange(int[] nums, int target) {
          int[]res= new int [2];
          res[0]= first(nums,target);
          res[1]= last(nums,target);
            return res;
        }


}
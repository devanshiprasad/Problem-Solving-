class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if(target.length==arr.length && Arrays.equals(arr,target)){
            return true;
        }
        return false; 
    }
}
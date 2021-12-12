class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i+=2){
            len+= nums[i];
        }
        
        int[] arr = new int[len];
        int j = 0;
        for(int i = 0; i < nums.length; i+=2){
            for(; nums[i] > 0; j++){
                arr[j] = nums[i+1];
                --nums[i];
            }
        }
        
        return arr;
    }
}
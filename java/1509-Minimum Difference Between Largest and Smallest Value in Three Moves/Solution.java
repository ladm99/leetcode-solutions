class Solution {
    public int minDifference(int[] nums) {
        int dif = 0;
        
        Arrays.sort(nums);
        
        if(nums.length <= 4){
            return 0;
        }
        
        int left = 0;
        int right = nums.length - 4;
        dif = nums[right] - nums[left];
        for(int i = 0; i < 3; i++){
            left++;
            right++;
            dif = Math.min(dif, nums[right] - nums[left]);
        }
        
        return dif;
    }
}
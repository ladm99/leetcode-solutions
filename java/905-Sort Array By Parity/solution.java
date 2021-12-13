class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        
        int i = 0;
        
        for(int x : nums){
            if( x % 2 == 0){
                result[i] = x;
                i++;
            }
        }
        
        for(int x : nums){
            if(x % 2 != 0){
                result[i] = x;
                i++;
            }
        }
        
        return result;
        
    }
}
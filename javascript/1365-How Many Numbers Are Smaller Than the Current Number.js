/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    let result = [];
    let count = 0;
    for(let i in nums){
        let cur = nums[i];
        for(let j in nums){
            if(nums[j] < cur && i != j){
                count++;
            }
        }
        
        result.push(count);
        count = 0;
    }
    
    return result;
};
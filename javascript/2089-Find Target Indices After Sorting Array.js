/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function(nums, target) {
    let result = []
    
    nums = nums.sort(function(a,b){return a - b});
 
    console.log(nums);
    for(let i in nums){
        if(nums[i] === target){
            result.push(i);
        }
    }
    return result;
};
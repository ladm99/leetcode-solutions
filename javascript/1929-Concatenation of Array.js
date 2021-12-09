//multiple ways to do this

//First
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
   return nums.concat(nums);
    
};

//Second
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    const result = [];
    let count = 0;
    
    for(let i = 0; i < nums.length * 2; i++){
        result.push(nums[count]);
        
        count++;
        if(count == nums.length){
            count = 0;
        }
    }
    
    return result;
    
};

//First way is slightly faster
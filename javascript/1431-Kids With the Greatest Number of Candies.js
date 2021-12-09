/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let bigger = true;
    let ans = [];
    for(let i in candies){
        let sum = candies[i] + extraCandies;
        for(let j in candies){
            if(candies[j] > sum){
                bigger = false;
                break;
            }
        }
        ans.push(bigger);
        bigger = true;
    }
    
    return ans;
};
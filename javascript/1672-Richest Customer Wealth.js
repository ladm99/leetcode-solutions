/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let max = 0;
    let sum = 0;
    
    for(let r = 0; r < accounts.length; r++){
        for(let c = 0; c < accounts[r].length; c++){
            sum+= accounts[r][c];
        }
        if(max < sum){
            max = sum;
        }
        sum = 0;
    }
    
    return max;
};
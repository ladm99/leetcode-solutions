/**
 * @param {string[]} patterns
 * @param {string} word
 * @return {number}
 */
var numOfStrings = function(patterns, word) {
    let count = 0;
    
    for(i in patterns){
        if(word.includes(patterns[i])){
            count++;
        }
    }
    return count;
};
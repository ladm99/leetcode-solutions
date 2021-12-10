/**
 * @param {number} num
 * @return {number}
 */
var maximum69Number  = function(num) {
    let x = num.toString();
    x = x.replace('6','9');
    
    return parseInt(x);
};
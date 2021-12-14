/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let num = n.toString();
    let product = 1;
    let sum = 0;
    
    for(let i = 0; i < num.length; i++){
        product = parseInt(product * num.substring(i,i+1));
        sum+= parseInt(num.substring(i,i+1));
    }
    
    return product - sum
};
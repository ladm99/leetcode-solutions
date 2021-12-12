/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    let cArr = s.split('');
    let i = 0;
    let result = [];
    
    while(i < indices.length){
        let c = indices.indexOf(i);
        result.push(cArr[c]);
        i++;
    }
    
    return result.join("");
};
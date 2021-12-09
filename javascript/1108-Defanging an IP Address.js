//2 ways to do this

//first
/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let result = []
    for(let i in address){
        if(address[i] === "."){
            result.push("[.]");
        } else{
            result.push(address[i]);
        }
    }
    
    return result.join('');
};

//second
/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    return address.replaceAll(".", "[.]");
};

//first is slightly faster
/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    let acc;
    return function(x) {
acc=x;
       for(let i=functions.length-1;i>=0;i--){
           acc=functions[i](acc);
       }
       return acc;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
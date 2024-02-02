/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    try{
        const [value1,value2]=await Promise.all([promise1,promise2]);
        return value1 + value2;
    }catch(err){
        console.err(err);
    }
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
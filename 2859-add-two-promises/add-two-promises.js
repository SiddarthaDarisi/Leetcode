/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
 try {
    // Use Promise.all to wait for both promises to resolve
    const [result1, result2] = await Promise.all([promise1, promise2]);

    // Calculate the sum of the resolved values
    const sum = result1 + result2;

    // Return a promise that resolves with the sum
    return Promise.resolve(sum);
  } catch (error) {
    // Handle any errors that may occur during promise resolution
    return Promise.reject(error);
  }
}
/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
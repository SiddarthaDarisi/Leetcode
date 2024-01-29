/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
  Array(90000); // For some reason, this makes the memory usage lesser O__o

  var cache;

  function fnFirst(v1, v2) {
    if (v2 === undefined) {
      runner = fnFor1;
      cache = Array(10);
    } else {
      runner = fnFor2;
      cache = new Map();
    } 

    return runner(v1, v2);
  }

  function fnFor2(v1, v2) {
    var key = (v2 << 15 | v1);

    var result = cache.get(key);
    if (result !== undefined) {
      return result;
    }

    result = fn(v1, v2);
    cache.set(key, result);
    return result;
  }

  function fnFor1(v1) {
    return cache[v1] ?? (cache[v1] = fn(v1));
  }

  var runner = fnFirst;

  return function (v1, v2) {
    return runner(v1, v2);
  }
}
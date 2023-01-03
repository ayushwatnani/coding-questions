/**
 * Task description: Write a method that returns an object composed of key-value pairs.
 * Expected Result: [['a', 1], ['b', 2]] => { a: 1, b: 2 }
 * Task Complexity: 2 of 5
 * @param {Array} array - a deep array of pairs
 * @returns {Array}
 */

const formPairs = (arr) => {
    return arr.reduce((acc, value) =>{
        if(Array.isArray(value)){
            acc[value[0]] = value[1];
        }
        return acc;
    }, {});
}

const data = [['a', 1], ['b', 2]];
console.log(formPairs(data)) // { 'a': 1, 'b': 2 }
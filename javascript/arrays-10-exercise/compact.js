/**
 * Task description: Write a method that clears array from all unnecessary elements, like false, undefined, empty strings, zero, null
 * Expected Result: [0, 1, false, 2, undefined, '', 3, null] => [1, 2, 3]
 * Task Complexity: 1 of 5
 * @param {Array} array - An array of any elements
 * @returns {Array}
 */

const compactArr = (data) =>{
    return data.filter((el) => el);
}

const data = [0, 1, false, 2, undefined, '', 3, null];
console.log(compactArr(data)) // [1, 2, 3]
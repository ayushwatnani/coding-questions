/**
 * Task description: Write a method that creates a new array with given values
 * Expected Result: (3, 'a') => ['a', 'a', 'a']
 * Task Complexity: 1 of 5
 * @param {number} arraySize - size of array
 * @param {?} value - value to fill
 * @returns {Array}
 */

const fillArr =  (arrSize, valueToFill) => new Array(arrSize).fill(valueToFill);

const data = 3;
const valueToFill = 'Ayush';
console.log(fillArr(data, valueToFill));
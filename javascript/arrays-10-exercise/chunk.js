/** 
  * Task description: Write a method that splits an array into parts of determined size 
  * Expected Result: ([1, 2, 3, 4, 5], 2) => [[1, 2], [3, 4], [5]] 
  * Task complexity: 3 of 5 
  * @param {Array} array - An array of any elements 
  * @param {number} size - size of chunks 
  * @returns {Array} 
*/
const chunk = (array, size) => {
    let chunkedArr = [];
    let index = 0;
    while(index < array.length){
        chunkedArr.push(array.slice(index, size + index));
        index = size + index;
    }
    return chunkedArr;
}
const data = [1, 2, 3, 4, 5, 6, 7];
console.log(chunk(data, 2)) // [[1, 2], [3, 4], [5, 6], [7]]
console.log(chunk(data, 3)) // [[1, 2, 3], [4, 5, 6], [7]]
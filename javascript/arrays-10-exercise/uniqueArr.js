/** 
  * Task description: Write a method that returns a duplicate-free array 
  * Expected Result: Duplicate-free array [1, 2, 3, 1, 2] => [1, 2, 3] 
  * Task Complexity: 2 of 5 
  * @param {Array<string | number>} array - Array of primitive data types 
  * @returns {Array} 
*/

const unique1 = (arr) => {
    return Array.from(new Set(arr));
}

const unique2 = (arr) => {
    return arr.filter((ele, id) =>{
        return arr.indexOf(ele) === id;
    });
}

const data = [1, 2, 1, 2, 3];
console.log(unique1(data)); // [1, 2, 3]
// console.log(data);
console.log(unique2(data)); // [1, 2, 3]
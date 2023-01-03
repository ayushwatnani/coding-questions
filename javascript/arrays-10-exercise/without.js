/** 
  * Task description: Write a method that returns an array without listed values 
  * Expected Result: [1, 2, 3, 1, 2] without 1, 2 => [3] 
  * Task Complexity: 2 of 5 
  * @param {Array} array - Array of primitive data types 
  * @param {?} args list of values to remove 
  * @returns {Array} 
*/

const withoutEle = (arr, ...args) => {
    filteredArr = [...arr]; 
    for(let i = 0; i < args.length; i++){
        filteredArr = filteredArr.filter((el) => el !== args[i]);
    }
    return filteredArr;
}

const data = [1, 2, 3, 1, 2];
console.log(withoutEle(data, 1, 2)); // [3]
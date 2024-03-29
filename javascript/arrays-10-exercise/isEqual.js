/** 
  * Task description: Write a method that makes a shallow compare of two arrays and returns true if they are identical. 
  * Expected Result: ([1, 2, 3], [1, 2, 3]) => true 
  * Task Complexity: 2 of 5 
  * @param {Array} firstArray - Array of primitive data types 
  * @param {Array} secondArray - Array of primitive data types 
  * @returns {boolean} 
*/
const isEqual = (firstArray, secondArray) => {
    if(firstArray.length !== secondArray.length) return false;

    const comparedArr = firstArray.map((el, id) => {
        return secondArray[id] === el;
    })

    return !comparedArr.includes(false);
  }

  const arr1 = [1, 2, 3, 4];
  const arr2 = [1, 2, 3, 4];
  const arr3 = [1, 2, 3, 5];
  const arr4 = [1, 2, 3, 4, 5];
  console.log(isEqual(arr1, arr2)); // true
  console.log(isEqual(arr1, arr3)); // false
  console.log(isEqual(arr1, arr4)); // false
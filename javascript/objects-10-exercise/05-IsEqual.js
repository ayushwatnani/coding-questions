const isEqual = (firstObj, secondObj) => {
	const firstObjKeys = Object.keys(firstObj);
	const secondObjKeys = Object.keys(secondObj);

	if(firstObjKeys.length !== secondObjKeys.length) return false;

	for(const prop in firstObj){
		console.log(`prop value : ${prop}`);
		if((firstObj[prop] !== secondObj[prop])) return false;
	}
	return true;
}

const data = { a: 1, b: 1, c:3 };
const data2 = { a: 1, b: 1 };
const data3 = { a: 1, b:1 , c: 3 };
console.log(isEqual(data, data2)); // true
console.log(isEqual(data, data3));

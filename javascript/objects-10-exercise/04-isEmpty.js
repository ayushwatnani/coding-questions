const isEmpty = (obj) => {
	const objKeys = Object.keys(obj);
	if(objKeys.length === 0) return true;
	console.log(objKeys.filter( (key) => obj[key] || obj[key] === 0 || obj[key] === false).length);
	return !objKeys.filter( (key) => obj[key] || obj[key] === 0 || obj[key] === false).length;
};

const data = { a:5, b:undefined };
const data2 = {a: undefined};
console.log(isEmpty(data));


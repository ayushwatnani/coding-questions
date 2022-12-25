const isPlainObject = (ele) => {
	return typeof ele === 'object' && !Array.isArray(ele) && ele !== null;
	}

const data = {a: 1};
console.log(isPlainObject(data));

const withoutProperty = (obj, ...args) =>{
	let newObj = {...obj};
	args.forEach(arg => {
		delete newObj[arg];
	});
	return newObj;
}

const data = {a:1, b:2, c:3}
console.log(withoutProperty(data, 'b', 'c'));

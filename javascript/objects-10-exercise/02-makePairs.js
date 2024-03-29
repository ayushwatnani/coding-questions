const makePairs01 = (obj) => {
	return Object.entries(obj);
}

const makePairs02 = (obj) => {
	return Object.keys(obj).map((ele)=>{		
		return [ele, obj[ele]];
	});
}

const makePairs03 = (obj) => {
	const res = [];
	for(const prop in obj){
		if(obj.hasOwnProperty(prop)){
			res.push([prop, obj[prop]]);
		}
	}
	return res;
}

const data = {a:1, b:2, c:3};
console.log(makePairs01(data));
console.log(makePairs02(data));
console.log(makePairs03(data));


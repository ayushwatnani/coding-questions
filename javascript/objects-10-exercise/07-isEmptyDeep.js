const isEmptyDeep = (ele) => {
	if(ele === null){
		return true;
	}
	if(Array.isArray(ele)){
		if(ele.length === 0) return true;
		let result;
		
		return result;
	}
	if(typeof ele === 'object' ){
		const objKeys = Object.keys(ele);
		if(keys.length === 0) return true;
		let result;
		return result;
	}
};

const areaOfTriangle = (b, h)=>{
    let area = b * h /2;
    return area;
}

const b = parseInt(prompt('enter base value '));
const h = parseInt(prompt('enter height value '));

console.log(`area of triangle is ${areaOfTriangle(b,h)}`);
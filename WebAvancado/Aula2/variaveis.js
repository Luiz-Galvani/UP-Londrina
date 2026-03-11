let nameN = "Luiz";
let years = 23;
let active = true;

console.log(typeof nameN)
console.log(typeof years)
console.log(typeof active)

console.log("Hello! My name is " + nameN + " and I'm " + years + " old.")

//Comparisons operators
let x = 10;
let y = "10";

console.log(x == y);
console.log(x === y); // false: diferent type



let isMember = true;
let discount = isMember ? 0.2 : 0;

console.log("Discount = " + discount);

let numbers = [1,2,3,4,5,6];

for(let i = 0; i< numbers.length; i++){
    console.log(numbers[i]);

}

console.log("\n")//OR

for(let n of numbers){
    console.log(n);

}

//Normal function
console.log("Function 'sum':")
function sum(a, b){
    return a + b;
}

console.log(sum(5,3));

console.log(sum("texto ", 2))

//Arrow function
const sum2 = (a, b){ 
    return a + b;
};

//OR

const sum2 = (a,b) => a + b;
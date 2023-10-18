const prompt = require("prompt-sync")({sigint:true});
let array = prompt("Enter Elements : ").split(',').map(Number);
array.sort((a,b)=>b-a);

console.log(array);
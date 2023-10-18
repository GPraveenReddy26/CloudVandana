const prompt = require("prompt-sync")({sigint:true});
let sentence = prompt("enter name : ");
let res = "";
res = sentence.split('').reverse().join('');
console.log(res);
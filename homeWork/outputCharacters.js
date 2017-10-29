/*9. Дана строка. вывести первый, последний и средний (если он есть) символы.
Пример var input = 'HellO1' //Result is first: H, last: 1
var middleInput = 'hellO' // Result is first: h, middle: l, last: O
var emptyInput = '' // Result 'No result'
var singleInput = 'a' //Result is first: a, last: a
*/

outputCharacter('HellO1');
outputCharacter('hellO');
outputCharacter('');
outputCharacter('a');

function outputCharacter (input){
if (input.length > 0 && input.length%2 === 0){
console.log("Result is first: " + input[0] + ", last: " + input[input.length - 1] + "." );
}
else if(input.length > 0  && input.length!==1 && input.length%2 !== 0  ){
var middle = input[Math.floor(input.length/2)];
console.log("Result is first: " + input[0] +", middle: " + middle + ", last: " + input[input.length -1] + "." )
}
else if(input.length===0){
console.log("Result: No rezult");
}
else if(input.length === 1){
console.log("Result is first: "+ input[0] +", last: " + input[0]);
}
}
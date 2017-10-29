/*
4. Даны две строки. определите, содержится ли меньшая по длине строка в большей.
var firstString = 'aba';
var secondString = 'bababa';
var result = false;
 Magic
console.log(result); //true
var firstString = 'bababa';
var secondString = 'bababa';
var result = false;
 Magic
console.log(result); //true
var firstString = 'bababa';
var secondString = 'bab1aba';
var result = false;
 Magic
console.log(result); //false
*/ 
function lineInLine(firstString,secondString ){
var result = false;
if(secondString.match(/aba/i) && secondString.search(/\d/) === -1){
result = true;
console.log(result)
}else 
console.log(result);
}
lineInLine('aba','bababa');
lineInLine('bababa','bababa');
lineInLine('bababa','bab1aba');
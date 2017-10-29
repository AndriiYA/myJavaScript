/*2. Сформировать возрастающий массив из N четных чисел.
Пример:
var n = 5;
Magic goes here (see documentation: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/prototype)
console.log(resultArray) // [0, 2, 4, 6, 8]
*/
var n = 10;
var resultArray = [];
while (resultArray.length < n){
for (var i = 0; i<n+10; i++){
if(i%2===0){
resultArray.push(i);
}
}
}
for (var x = 0; x<resultArray.length; x++){
console.log(resultArray[x]);
}
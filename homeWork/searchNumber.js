 /*8. Определить, содержит ли массив данное число x
Пример var x = 0;
var array = [1, 2, 3, 10 ,122, 0];
var result = false;
  //Magic
console.log(result); //true
*/
var array = [1, 2, 3, 10 ,122, 0];

function searchNumber(mas , result){
for (var i=0; i<array.length; i++){
if(array[i] === result){
return true;
}
}return false;
}

searchNumber(array, 1);
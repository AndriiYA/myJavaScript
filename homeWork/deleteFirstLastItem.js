/* 3. Удалить в массиве первый и последний элементы.
Пример: var array = [1, 2, 3];
var emptyArray = [];
 Magic (see documentation or do as you think should be  right (via loops or another way) )
Результат:
[2] //array
[] //empty array
*/
var array = [1,2,3];
if(array.length === 0 || array.length === 1 || array.length === 2){
console.log("empty array");
}
array.pop(array.length-1);
array.splice(0, 1);
for(i=0; i<array.length; i++){
console.log(array[i]);
}
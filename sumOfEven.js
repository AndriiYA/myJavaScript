// Найдите сумму чисел массива, которые стоят на четных местах.
var array = [1,2,3,4,5];
var tmp = 0;
for (var i = 0; i < array.length; i++){
if (i % 2 === 0){
tmp = tmp + array[i];
}
}
console.log (tmp);
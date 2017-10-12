// Удалить в массиве первый и последний элементы.
var mas = [2,3,4,5,6,78,89];
mas.splice(0, 1);
mas.splice(-1,1);
for (var i = 0; i<mas.length; i++){
console.log(mas[i]);
}
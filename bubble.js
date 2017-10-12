//Buble var buble = function (mas){
for (var i = 0; i<mas.length; i++){
//console.log (mas[i] + " ");
}
for (var i = mas.length - 1; i>=0; i--){
for (var index = 0; index<i; index++){
if (mas[index] > mas [index + 1]){
var tmp = mas [index];
mas [index] = mas [index + 1];
mas [index + 1] = tmp;
}
}
}
for (var index = 0; index < mas.length; index++){
console.log (mas[index] + " ");
}
}
buble([23,4,65,6,0,8,12]);
//Определить, содержит ли массив данное число x
var haveNumber = function (x){
var array = [9,8,7,6,5,4,3,2,1];
for (var i = 0; i < array.length; i++){
if (array[i] === x){
return "have number!!!";
}
}
console.log(" not have ");
}
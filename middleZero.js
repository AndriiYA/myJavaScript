//Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
//var arr = [1,0,0,0,0,0,0,0,0,1];
//for (var i = 0; i<arr.length; i++){
//console.log(arr[i])} var nar=new Array();
nar[0] = 1;
for (var i=1; i<=5; i++){
//var n=Math.random()*10;
//n=Math.round(n);
var n = 0;
nar.push(n);
}
for (var i = 0; i<nar.length; i++){
nar[nar.length-1] = 1;
console.log(nar[i] + " ")
}
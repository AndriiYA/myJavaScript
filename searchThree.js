//Вывести на экран числа от 1000 до 9999 такие, что среди цифр есть цифра 3.
var tmp  = [];
var tmp2 = [];
var num = 0;
for(var i = 1000; i<9999; i++){
tmp.push(String(i));
}for (var a = 0; a<tmp.length;a++){
 num = tmp[a];
if (String(num).indexOf('3')>= 0){
tmp2.push(num);
console.log(num);
}
}
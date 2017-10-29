//1. Найдите четырехзначные числа, сумма цифр которых равна 15.
for(var i =1000; i<10000; i++){
var number = i;
var a = Math.floor(number/1000);
var b = Math.floor((number/100)%10);
var c = Math.floor((number/10)%10);
var d = number%10;
if (a + b + c + d === 15){
var x = x + 1;
console.log(number + ":"+ x);
}
}
//Пользователь вводит два числа. Если они не равны 10 и первое число четное, то вывести их сумму, иначе вывести их произведение.
var one = +prompt('number', 100);
var two = +prompt("number", 100);
if (one != 10 && one % 2 == 0 && two != 10){
console.log(one + two);
}else {
console.log(one * two);
}
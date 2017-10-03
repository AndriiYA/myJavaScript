//Даны три числа. Написать "yes", если среди них есть одинаковые. !
var one =+ prompt('number', 100);
var two =+ prompt("number", 100);
var three =+ prompt("number", 100);
if (one == two && two == three && three == one){
console.log("yes");
}else {
console.log("ne ravni");
}
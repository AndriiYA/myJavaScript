//Создать массив, каждый элемент которого равен квадрату своего номера 
var n = prompt ("Enter how many items in the array", 0);
var a = [ ];
for(var i=0; i < n; i++){
 a[i] = i*i;
}                        
alert (a)
//Дано четырехзначное число. Определите, есть ли одинаковые цифры в нем.
/*var one = prompt('number', 1000);
var a = Math.floor(one/1000);
var b = Math.floor((one/100)%10);
var c = Math.floor((one/10)%10);
var d = one%10;
if (a===b || a===c || a===d){
console.log(" ravni ")}
else if (b===c || b===d || b===a){
console.log(" ravni ")}
else if(c===d || c===b || c===a){
console.log(" ravni ")}
else{
console.log("net ravnih");
}
*/
var one = prompt('number', 100000000);
var one = String(one);
var arr = one.split('');
		var i = 0, k = 0;
		for (i = 0; i < arr.length; i++) {
			for (k = arr.length; k > i; k--) {
				if (arr[i] == arr[k]) {
					console.log(" ravni ");
                  break;
				}
			}
		}
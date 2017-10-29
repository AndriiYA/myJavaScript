/*10. Дана строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'
Пример:
var abcInput = 'abca' //Result is 'wwwa'
var empty = ''; //Result is 'zzz'
var singleInput = 'a'; //Result is 'azzz'
*/

function name (str){
if (str.match(/abc/i)){
var tmp = str.split("abc");
console.log(tmp[0]+ 'www' +tmp[1]); 
}
//console.log("Result is " + tmp);

else if (str.match(/a/i)){
var z = "zzz"
str = str + z;
console.log("Result is " + str);
}else if (str.match("")){
str = "zzz";
console.log("Result is " + str);
}
}

name('abca');
name('');
name('a');
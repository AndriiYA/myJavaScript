/*5. Удалить в строке все цифры.
var input = '12345678a1231'//result is 'a'
*/

var input = '12345678a1231';
console.log(input.replace(/[0-9]/g, ''));
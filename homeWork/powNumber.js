/*7. Найдите сумму квадратов первых n натуральных чисел
Пример var n = 2
Результат: The sum is 5
*/
var number = 3;
var sum = 0;
for(i = 1; i <= number; i++){
sum += Math.pow(i, 2);
}console.log(sum);
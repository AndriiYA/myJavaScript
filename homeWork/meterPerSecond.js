/* Задано время в минутах и расстояние в километрах. Найдите скорость в м/c
Пример: var distance = 3.6 км; var time = 60 мин;
Резульат: 'The speed is 1 meter per second' */
var distance = 4;
var time = 60;
//time = Math.floor(time / 60)+(time % 60);
var metr = distance*1000;
var second = time*60;
console.log('The speed is 1 meter per second: ' + metr/second);
function isEmpty(obj){
for(var key in obj){
return false;
}
return true;
}  function minNumber(obj){
var min = 0;
var minNum = '';
for(var i in obj ){
if(min <obj[i]){
min = obj[i];
minNum = i;
}
}
return (minNum || "net")
}

//Дан массив. Найдите два соседних элемента, сумма которых минимальна.
		var array = [];
		var array2= [];
		var sum = array[array.length-1] + array[0];
		for (var i = 0; i<array.length; i++){
		//if (i % 2 == 0){
        array2.push(sum);
		sum = array [i] + array[i + 1];
        
		//}
		}for (var a =0; a<array2.length; a++){
        if(array2[a] < array2[0]){
        array2[0] = array2[a];
        //console.log(array2[a]);
    }
}
console.log(array2[0]);
console.log (isEmpty(array)); console.log(minNumber(array2));
//Дан массив. Найдите два соседних элемента, сумма которых минимальна.
		var array = [2,3,4,0,6,7,1,-15];
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
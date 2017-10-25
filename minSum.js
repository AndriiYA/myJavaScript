//Дан массив. Найдите два соседних элемента, сумма которых минимальна.
		var array = [2,3,4,0,6,7,1,9];
		var array2= [];
		var sum = 0;
		for (var i = 0; i<array.length; i++){
		if (i % 2 == 0){
		sum = array [i] + array[i + 1];
		array2.push(sum);
		}
		}for (var a =0; a<array2.length; a++){
        if (array2[a] < array2[a+1]){
        var tmp = array2[a];
        console.log(tmp);
        } 
        }
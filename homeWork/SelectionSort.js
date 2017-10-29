// Сортировка выбором          var array = [3,2,1,4,5,0];
		var n = array.length;
		for (var i = 0; i < n-1; i++) {
			var min = i;
			for(var j = i+1; j<n; j++) {
				if(array[j] < array[min]) 
					min = j;
			} 
			   var tmp = array[min];
			   array[min] = array [i];
			   array[i] = tmp;
				}
				for (var c = 0; c<array.length; c++ ) {
				console.log(array[c]);	
				}
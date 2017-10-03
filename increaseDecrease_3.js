//  Дано число. Если оно больше 3, то увеличить число на 10, иначе уменьшить на 10.  
    var value = 123;
    var d = 10;
    if(value > 3){
        value += d;
    console.log("\n" + value);
    }else{
        value -= d;
    console.log("\n" + value);
    }
let a = 50;

const printNprime = function(a){
    if(a <= 1){
        return false;
    }else if(a === 2){
        return true;
    }else if (a % 2 === 0){
        return false;
    }
    for(let i = 3;i<Math.sqrt(a);i+=2){
        if(a % i == 0){
            return false;
        }
    }
    return true;
}

for(let i = 0 ; i<=a;i++){
    if(printNprime(i)){
        console.log(`${i}th till ${a} is a primeNumber`);
    }
}
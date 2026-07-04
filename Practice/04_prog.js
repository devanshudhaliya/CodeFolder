let a = Math.floor(Math.random() * 10);

const isEvenOdd = function(n){
   if(n % 2 == 0){
    console.log(` Given number ${n} is EVEN`);
   }
   else{
    console.log(`Number ${n} is ODD `);
   }
}

isEvenOdd(a);
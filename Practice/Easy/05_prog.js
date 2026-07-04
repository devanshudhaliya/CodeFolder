let x = Math.floor(Math.random() *10 );
let y = Math.floor(Math.random() *10 );

const isLargest = (a,b)=>{
    if(a > b){
        console.log(`Number ${a} is the gratest number `);
    }
    else if( b > a){
        console.log(`Number ${b} is the gratest number `)
    }
    else{
        console.log(`Number ${a} is equal to Number ${b}`);
    }
}

isLargest(x,y)
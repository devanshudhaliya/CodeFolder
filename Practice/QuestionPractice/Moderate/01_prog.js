let a = Math.floor(Math.random() * 10);

const isPrime = (num) => {

    if (num <= 1) {
        console.log(`Number ${num} is not a prime number`);
        return false;
    }

    if (num === 2) {
        console.log(`Number ${num} is a prime number`);
        return true;
    }

    if (num % 2 === 0) {
        console.log(`Number ${num} is not a prime number`);
        return false;
    }

    const limit = Math.sqrt(num);

    for (let i = 3; i <= limit; i += 2) {
        if (num % i === 0) {
            console.log(`Number ${num} is not a prime number`);
            return false;
        }
    }

    console.log(`Number ${num} is a prime number`);
    return true;
};

isPrime(a);
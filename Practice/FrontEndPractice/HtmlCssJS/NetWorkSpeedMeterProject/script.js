async function testSpeed() {
    const image = "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg";
    const start = performance.now();

    const response = await fetch(image + "?cache=" + Math.random());
    const blob = await response.blob();

    const end = performance.now();

    const timeTaken = (end - start) / 1000; // seconds
    const sizeInBits = blob.size * 8;

    const speedMbps = (sizeInBits / timeTaken) / (1024 * 1024);

    console.log(`Download Speed: ${speedMbps.toFixed(2)} Mbps`);
}

testSpeed();
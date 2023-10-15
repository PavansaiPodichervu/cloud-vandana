const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the size of the array: ', (size) => {
    const n = parseInt(size);
    const arr = [];

    (function getElements(index) {
        if (index < n) {
            rl.question(`Enter element ${index + 1}: `, (element) => {
                arr.push(parseInt(element));
                getElements(index + 1);
            });
        } else {
            bubbleSortDescending(arr);
            console.log(arr);
            rl.close();
        }
    })(0);
});
function bubbleSortDescending(arr) {
    const len = arr.length;
    for (let i = 0; i < len - 1; i++) {
        for (let j = i + 1; j < len; j++) {
            if (arr[i] < arr[j]) {
                const temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

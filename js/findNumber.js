const data = require('./numbers');

// Find the closest number to the input (number)
// Use const to define variable with constant value (will not change) e.g. const two = 2;
// Use let to define a variable that will change e.g. let two = 2; two = 3;

const findClosestNumber = (number) => {
    // write code here
    return -1;
};

const findNumberClosestNumberRecordingTime = (number) => {
    const startTime = process.hrtime()[1];
    try {
        return findClosestNumber(number);
    } finally {
        console.log('Time taken = ' + (process.hrtime()[1] - startTime));
    }
    
};

console.log('Number found = ' + findNumberClosestNumberRecordingTime(1));
console.log('Number found = ' + findNumberClosestNumberRecordingTime(752169));
console.log('Number found = ' + findNumberClosestNumberRecordingTime(900000));
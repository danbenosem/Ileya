// 1. Import and initialize the prompt-sync module
const prompt = require('prompt-sync')({ sigint: true });

console.log("--- Welcome to the Sync Prompt Demo ---");

// 2. Simple text input
const name = prompt("What is your name? ");
console.log(`Hello, ${name}!`);

// 3. Number input (Must convert string to number)
const ageInput = prompt("How old are you? ");
const age = Number(ageInput);

if (isNaN(age)) {
    console.log("That was not a valid number!");
} else {
    console.log(`Next year, you will be ${age + 1} years old.`);
}

// 4. Secret input (e.g., hiding a password as you type)
// Note: To use this feature, install: npm install prompt-sync-history
/*
const password = prompt('Enter password: ', {echo: '*'});
console.log(`Your password is saved securely.`);
*/


// Importing the function using the traditional require method
const { add } = require('./ty');

// A standard Jest test block
describe('Calculator Tests', () => {
    
    test('should correctly add two numbers', () => {
        const result = add(2, 3);
        expect(result).toBe(5);
    });

    test('should handle negative numbers', () => {
        const result = add(-1, -5);
        expect(result).toBe(-6);
    });
    
});


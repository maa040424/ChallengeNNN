function kalkulator(a, b, operator) {
    switch (operator) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b;
        default: return "Operator tidak valid";
    }
}

console.log(kalkulator(10, 5, '+'));  // Output: 15

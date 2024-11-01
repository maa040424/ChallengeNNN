double kalkulator(double a, double b, String operator) {
  switch (operator) {
    case '+':
      return a + b;
    case '-':
      return a - b;
    case '*':
      return a * b;
    case '/':
      return a / b;
    default:
      print("Operator tidak valid");
      return 0;
  }
}

void main() {
  print(kalkulator(10, 5, '+')); // Output: 15.0
}

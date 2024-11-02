import 'dart:math';

void main() {
  print("Masukkan jari-jari lingkaran:");
  double radius = double.parse(stdin.readLineSync()!);

  double luas = pi * pow(radius, 2);
  double keliling = 2 * pi * radius;

  print("Luas: $luas");
  print("Keliling: $keliling");
}

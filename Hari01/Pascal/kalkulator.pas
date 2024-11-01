program Kalkulator;
var
  a, b: real;
  operator: char;
begin
  writeln('Masukkan angka pertama:');
  readln(a);
  writeln('Masukkan operator (+, -, *, /):');
  readln(operator);
  writeln('Masukkan angka kedua:');
  readln(b);
  
  case operator of
    '+': writeln('Hasil: ', a + b:0:2);
    '-': writeln('Hasil: ', a - b:0:2);
    '*': writeln('Hasil: ', a * b:0:2);
    '/': writeln('Hasil: ', a / b:0:2);
  else
    writeln('Operator tidak valid');
  end;
end.

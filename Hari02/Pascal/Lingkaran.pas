program Lingkaran;
uses Math;

var 
    radius, luas, keliling, real;
begin
    write('Masukkan jari-jari lingkaran: ');
    readln(radius);

    luas := Pi * Power(radius, 2);
    keliling := 2 * Pi * radius;

    writeln('Luas: ', luas:0:2);
    writeln('Keliling: ', keliling:0:2);

end;
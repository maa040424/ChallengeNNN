from turtle import *
import colorsys

bgcolor("black")  # Mengatur warna latar belakang
tracer(500)  # Mengatur kecepatan gambar

def draw():
    h = 0  # Variabel untuk warna
    for i in range(75):  # Menggambar 75 lingkaran
        c = colorsys.hsv_to_rgb(h, 1, 1)  # Menghasilkan warna RGB dari HSV
        h += 0.5  # Mengubah hue untuk variasi warna
        up()  # Mengangkat pena agar tidak menggambar
        goto(0, 0)  # Kembali ke titik awal
        down()  # Menurunkan pena untuk mulai menggambar
        color('black')  # Mengatur warna garis luar
        fillcolor(c)  # Mengatur warna isi
        begin_fill()  # Memulai pengisian warna
        rt(98)  # Memutar turtle
        circle(i, 12)  # Menggambar lingkaran
        fd(290)  # Bergerak maju
        fd(i)  # Bergerak maju lagi
        lt(29)  # Memutar turtle
        for j in range(129):  # Menggambar pola tambahan
            fd(i)  # Bergerak maju
            circle(j, 299, steps=2)  # Menggambar bentuk lingkaran
        end_fill()  # Mengakhiri pengisian warna

draw()  # Memanggil fungsi draw untuk menggambar
done()  # Menandakan akhir program

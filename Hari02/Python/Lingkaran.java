import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();

        double luas = Math.PI * Math.pow(radius, 2);
        double keliling = 2 * Math.PI * radius;

        System.out.println("Luas :" + luas);
        System.out.println("Keliling :" + keliling);
    }
}

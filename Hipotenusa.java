import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();
            
            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();
            
            double hipotenusa = hitungHipotenusa(panjang, lebar);
            
            System.out.println("Hipotenusa: " + hipotenusa);
        }
    }
    
    public static double hitungHipotenusa(double panjang, double lebar) {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }
}

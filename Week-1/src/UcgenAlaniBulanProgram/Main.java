package UcgenAlaniBulanProgram;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk kenarı giriniz: ");
        double a = input.nextDouble();

        System.out.print("Lütfen ikinci kenarı giriniz: ");
        double b = input.nextDouble();

        System.out.print("Lütfen üçüncü kenarı giriniz: ");
        double c = input.nextDouble();

        // Math.sqrt yapısı bize sayının karesini almamızı sağlıyor
        // Math sınıfında bulunur
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}


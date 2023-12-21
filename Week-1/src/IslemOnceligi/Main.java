package IslemOnceligi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int c = scanner.nextInt();

        scanner.close();

        int sonuc = a + b * c - b;

        System.out.println("Yapılan işlem sonucu: " + sonuc);
    }
}

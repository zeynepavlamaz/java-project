package UsluSayiProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üssü girin: ");
        int us = scanner.nextInt();

        scanner.close();

        int sonuc = 1; // Üslü sayı hesaplama sonucunu saklamak için bir değişken

        // Üslü sayıyı hesaplama
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}

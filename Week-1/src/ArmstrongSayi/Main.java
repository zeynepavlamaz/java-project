package ArmstrongSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        int tempSayi = sayi;
        int toplam = 0;

        while (tempSayi != 0) {
            int basamak = tempSayi % 10;
            toplam += basamak;
            tempSayi /= 10;
        }

        System.out.println(sayi + " sayısının basamaklarının toplamı: " + toplam);
    }
}

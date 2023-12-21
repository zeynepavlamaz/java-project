package MukemmelSayi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        // scanner.close(); metodunu kullanarak programın
        // hafızayı doğru şekilde kullanmasını sağlayabiliriz.

        if (sayi < 1) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            return;
        }

        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}

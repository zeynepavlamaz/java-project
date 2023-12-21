package JavaDongulerPratik;

/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        scanner.close();

        int toplam = 0; // Tam bölünen sayıların toplamı
        int adet = 0; // Tam bölünen sayıların adedi

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunmamaktadır.");
        }
    }
}

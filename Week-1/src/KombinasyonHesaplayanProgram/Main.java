package KombinasyonHesaplayanProgram;

import java.util.Scanner;

public class Main {

    // Faktoriyel hesaplama
    public static int faktoriyel(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * faktoriyel(n - 1);
    }

    // Kombinasyon hesaplama
    public static int kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i girin: ");
        int n = scanner.nextInt();

        System.out.print("r'i girin: ");
        int r = scanner.nextInt();

        scanner.close();

        //n ≥ r Olmalıdır:
        // Eğer n < r ise, seçilecek öğe sayısı toplam öğe sayısından
        // fazla olur ki bu mantıklı bir durum değildir.
        if (n < r) {
            System.out.println("Hatalı giriş. n, r'den küçük olmalıdır.");
            return;
        }

        int kombinasyonSonucu = kombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyonSonucu);
    }
}

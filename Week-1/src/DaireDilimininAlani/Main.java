package DaireDilimininAlani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // π sayısını tanımla --- Math.PI yapısı da kullanılabilir ---
        double pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        double yaricap = scanner.nextDouble();

        // Alan hesaplaması
        double alan = pi * yaricap * yaricap;
        System.out.println("Dairenin Alanı: " + alan);

        // Çevre hesaplaması
        double cevre = 2 * pi * yaricap;
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire dilimi alanı hesaplaması
        System.out.print("Merkez açısının ölçüsünü giriniz (derece): ");
        double aci = scanner.nextDouble();

        double daireDilimiAlan = (pi * yaricap * yaricap * aci) / 360;
        System.out.println("Daire Diliminin Alanı: " + daireDilimiAlan);

        scanner.close();
    }
}

// Math.PI yapısı da kullanılabilir


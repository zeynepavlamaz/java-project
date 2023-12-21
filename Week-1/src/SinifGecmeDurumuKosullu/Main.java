package SinifGecmeDurumuKosullu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik sınav puanınızı girin: ");
        double matematik = input.nextDouble();

        System.out.println("Fizik sınav puanınızı girin: ");
        double fizik = input.nextDouble();

        System.out.println("Kimya sınav puanınızı girin: ");
        double kimya = input.nextDouble();

        System.out.println("Türkçe sınav puanınızı girin: ");
        double turkce = input.nextDouble();

        System.out.println("Müzik sınav puanınızı girin: ");
        double muzik = input.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + muzik) / 5;

        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama >= 60) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}

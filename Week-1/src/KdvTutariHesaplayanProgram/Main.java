package KdvTutariHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sınıfını tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcısan veri aldık
        System.out.print("Lütfen ürün fiyatını giriniz: ");

        // Değikenler tanımlandı
        double fiyat = input.nextDouble();

        double kdvOrani = (fiyat > 1000) ? 0.08 : 0.18;

        double kdvTutari = fiyat * kdvOrani;

        double kdvliFiyat = fiyat + kdvTutari;


        System.out.println("KDV'siz Fiyat: " + fiyat);

        System.out.println("KDV Oranı: %" + (int)(kdvOrani * 100));

        System.out.println("KDV Tutarı: " + kdvTutari);

        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}

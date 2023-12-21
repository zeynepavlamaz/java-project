package KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz: ");

        String sifre = input.nextLine();
        String dogruSifre = "1234";

        if (sifre.equals(dogruSifre)) {
            System.out.println("Şifreniz doğru.");
        } else {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = input.nextLine();
            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre)) {
                    System.out.println("Yeni şifreniz, eski şifrenizle aynı olamaz. Lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }
    }
}

package ArtikYilHesaplayanProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // kullanıcıdan yıl verisi al
        System.out.println("Yıl Giriniz : ");
        int yil = input.nextInt();

        // Yılın artık olup olmadığını kontrol et
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            System.out.println("2020 bir artık yıldır !");
        } else {
            System.out.println("2021 bir artık yıldır değildir !");
        }
    }
}

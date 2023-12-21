package ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5.00;

        System.out.print("Armut kaç kilo? : ");
        double armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKg = input.nextDouble();

        double toplamTutar = (armutKg * armutKgFiyat) + (elmaKg * elmaKgFiyat) + (domatesKg * domatesKgFiyat) + (muzKg * muzKgFiyat) + (patlicanKg * patlicanKgFiyat);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}


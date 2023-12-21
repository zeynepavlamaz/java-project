package TipDonusumleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz , ile ayırınız: ");
        double ondalikliSayi = scanner.nextDouble();

        scanner.close();

        // Tam sayıyı double'a dönüştürme
        double tamSayiToDouble = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int ondalikliSayiToInt = (int) ondalikliSayi;

        System.out.println("Tam sayıyı double'a dönüştürdüğümüzde: " + tamSayiToDouble);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + ondalikliSayiToInt);
    }
}

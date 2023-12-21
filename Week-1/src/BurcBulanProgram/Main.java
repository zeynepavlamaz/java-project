package BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz: ");
        int day = input.nextInt();
        System.out.print("Doğum ayınızı giriniz: ");
        int month = input.nextInt();

        String burc = "";
        if (month == 1) {
            if (day < 22)
                burc = "Oğlak";
            else
                burc = "Kova";
        } else if (month == 2) {
            if (day < 20)
                burc = "Kova";
            else
                burc = "Balık";
        } else if (month == 3) {
            if (day < 21)
                burc = "Balık";
            else
                burc = "Koç";
        } else if (month == 4) {
            if (day < 21)
                burc = "Koç";
            else
                burc = "Boğa";
        } else if (month == 5) {
            if (day < 22)
                burc = "Boğa";
            else
                burc = "İkizler";
        } else if (month == 6) {
            if (day < 23)
                burc = "İkizler";
            else
                burc = "Yengeç";
        } else if (month == 7) {
            if (day < 23)
                burc = "Yengeç";
            else
                burc = "Aslan";
        } else if (month == 8) {
            if (day < 23)
                burc = "Aslan";
            else
                burc = "Başak";
        } else if (month == 9) {
            if (day < 23)
                burc = "Başak";
            else
                burc = "Terazi";
        } else if (month == 10) {
            if (day < 23)
                burc = "Terazi";
            else
                burc = "Akrep";
        } else if (month == 11) {
            if (day < 22)
                burc = "Akrep";
            else
                burc = "Yay";
        } else if (month == 12) {
            if (day < 22)
                burc = "Yay";
            else
                burc ="Oğlak";
        }

        System.out.println("Burcunuz: "+burc);
    }
}

package HavaDurumunaGoreEtkinlikOnerme;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık değerini girin: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Yüzme etkinliğini öneririm.");
        }
    }
}

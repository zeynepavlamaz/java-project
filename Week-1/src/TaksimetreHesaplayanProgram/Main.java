package TaksimetreHesaplayanProgram;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, perKm = 2.20, totalAmount, startPrice = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");

        km = input.nextDouble();

        totalAmount = startPrice + (km * perKm);
        totalAmount = Math.max(totalAmount, 20);

        System.out.println("Taksimetre tutarı: " + totalAmount + " TL");
    }
}

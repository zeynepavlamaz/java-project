package EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // EBOB hesaplama
        int ebob = calculateEBOB(num1, num2);
        System.out.println("EBOB(" + num1 + ", " + num2 + ") = " + ebob);

        // EKOK hesaplama
        int ekok = calculateEKOK(num1, num2, ebob);
        System.out.println("EKOK(" + num1 + ", " + num2 + ") = " + ekok);
    }

    // EBOB hesaplama fonksiyonu
    public static int calculateEBOB(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    // EKOK hesaplama fonksiyonu
    public static int calculateEKOK(int a, int b, int ebob) {
        return (a * b) / ebob;
    }
}

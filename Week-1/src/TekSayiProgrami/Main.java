package TekSayiProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        System.out.println("Sayıları girmeye başlayın. 0 girerek işlemi sonlandırın.");

        do {
            System.out.print("Bir sayı girin: ");
            input = scanner.nextInt();

            if (input % 2 == 0 || input % 4 == 0) {
                sum += input;
            }
        } while (input != 0);

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: " + sum);

        scanner.close();
    }
}


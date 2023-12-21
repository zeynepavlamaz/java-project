package Elmas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = scanner.nextInt();

        // Üst kısım
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }

        // Alt kısım
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

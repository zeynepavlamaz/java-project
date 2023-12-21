package SayilariKucuktenBuyugeSiralayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcının gireceği üç sayıyı
        //belleğin Stack kısmında tutan
        // bir integer dizisi oluşturuluyor.
        int[] numbers = new int[3];

        System.out.println("Lütfen 3 sayı giriniz:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Girilen sayılar küçükten büyüğe sıralandı:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

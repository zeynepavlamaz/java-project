package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scanner.nextInt();

       // scanner.close();

        System.out.println(n + " Elemanlı Fibonacci Serisi:");

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            /*int next = first + second;: Bu satırda, first ve second değişkenlerinin toplamı,
            bir sonraki Fibonacci sayısını temsil eden next değişkenine atanır. */

            /*first = second;: first değişkenine, second değişkeninin değeri atanır.
            Böylece, first artık bir önceki Fibonacci sayısını temsil eder.*/

            /*second = next;: second değişkenine, next değişkeninin değeri atanır.
            Böylece, second artık en son hesaplanan Fibonacci sayısını temsil eder.*/
        }
    }
}

package HarmonikSayi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        double toplam=0;

        System.out.print("bir sayı giriniz:");
        n = input.nextInt();

        for(int i=1;i<=n;i++){
            toplam += 1.0/i;
        }

        System.out.println(toplam);
    }
}

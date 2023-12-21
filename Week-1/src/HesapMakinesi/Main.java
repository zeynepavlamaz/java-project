package HesapMakinesi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a, b, islem;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.println("Toplama için 1\nÇıkarma için 2\nÇarpma için 3\nBölme için 4");
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz : ");
        islem = input.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplam : " + (a+b));
                break;

            case 2:
                System.out.println("Çıkarma : " + (a-b));
                break;

            case 3:
                System.out.println("Çarpım : " + (a*b));
                break;

            case 4:
                switch(b){
                    case 0:
                        System.out.println("Sıfıra bölme işlemi yapılamaz!");
                        break;
                    default:
                        System.out.println("Bölüm : " + (a/b));
                }
                break;

            default:
                System.out.println("Hatalı işlem seçimi yaptınız!");
        }
    }
}
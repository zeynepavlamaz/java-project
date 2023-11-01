import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Metin Girisi");
            System.out.println("2. En Son Kaydedileni Görüntüle");
            System.out.println("3. Çıkış");
            System.out.print("Seciminizi yapin: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı okuyor

            switch (secim) {//Kullanıcının seçimine göre bir switch ifadesi kullanılır.
                case 1:
                    metinGirVeKaydet();
                    break;
                case 2:
                    enSonKaydedileniGoruntule();
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor.");
                    return;
                default:
                    System.out.println("Geçersiz secim. Lütfen tekrar deneyin.");
            }
        }
    }

    public static void metinGirVeKaydet() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir metin girin: ");
            String metin = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("notlar.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();

            System.out.println("Metin başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosya kaydetme hatası: " + e.getMessage());
        }
    }

    public static void enSonKaydedileniGoruntule() {
        try {
            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            bufferedReader.close();

            if (okunanMetin != null) {
                System.out.println("En Son Kaydedilen Metin:");
                System.out.println(okunanMetin);
            } else {
                System.out.println("Henüz hiç metin kaydedilmemiş.");
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
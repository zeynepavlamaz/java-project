package NotOrtalamasiHesaplayanProgram;

// Kullanıcıdan not verisi almak için scanner nesnesi oluşturduk ve import ile içe aktardık.
import java.util.Scanner;

// Main adında bir sınıf tanımladık
public class Main{

    // Main sınıfında public static void main(String[] args) adında metod var
    // Program bu metoddan başlar
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Scanner input = new Scanner(System.in); kodu,
          kullanıcının klavyeden girdiği verileri okumak için bir Scanner nesnesi oluşturur.
          System.in parametresi, kullanıcının girdilerinin standart giriş akışından (stdin) okunacağını belirtir.
          Bu nedenle, Scanner nesnesi, kullanıcının klavyeden girdiği verileri okumak için kullanılır. */


        /*kullanıcıdan sınav puanlarını almak için nextInt()
        yöntemini kullanarak her ders için bir değişken tanımlıyoruz.*/

        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        String sinifDurumu = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(sinifDurumu);
    }
}

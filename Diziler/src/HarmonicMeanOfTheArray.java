
import java.util.Scanner;//Programda kullanacağımız Scanner sınıfını kullanabilmek için java.util paketinden Scanner sınıfını içeri aktarıyoruz.


public class HarmonicMeanOfTheArray {//HarmonicMeanOfTheArray adında bir Java sınıfı tanımlanıyor. Sınıfın ismi büyük harfle başlamalıdır ve dosya adıyla aynı olmalıdır.

    public static double Harmonic(double[] dizi) {//harmonic adında bir metod tanımlanıyor. Bu metod, bir double türünden diziyi parametre olarak alır ve bir double türünde değer döndürür.

        int n = dizi.length;//n değişkenine dizinin uzunluğu atanıyor (kaç adet sayı olduğu).
        double toplamTersleri = 0;//toplamTersleri adında bir değişken tanımlanıyor ve başlangıçta sıfıra eşitleniyor.

        for (double eleman : dizi) {//Bir for döngüsü ile dizinin her elemanının terslerini alarak toplamTersleri değişkenine ekliyoruz. Bu, dizideki elemanların terslerinin toplamını hesaplamak için bir döngüdür.
            toplamTersleri += 1.0 / eleman;
        }

        return n / toplamTersleri;//Hesaplanan harmonik ortalama değeri return ifadesi ile geri döndürülüyor.

    }

    public static void main(String[] args) {//Programın ana çalışma noktası olan main metodu tanımlanıyor.
        Scanner scanner = new Scanner(System.in);//Kullanıcıdan girdi almak için bir Scanner nesnesi oluşturuluyor.
        System.out.print("Kaç adet sayı gireceksiniz? ");//Kullanıcıdan kaç adet sayı gireceğini sormak için ekrana bir mesaj yazdırılıyor ve kullanıcının girdisi alınıyor.
        int n = scanner.nextInt();

        double[] sayilar = new double[n];//Kullanıcının gireceği sayıları saklamak için bir double türünden dizi oluşturuluyor.
        System.out.println("Sayıları girin:");//Kullanıcıya sayıları girmesi için ekrana bir mesaj yazdırılıyor.

        for (int i = 0; i < n; i++) {//Bir for döngüsü ile kullanıcının gireceği sayıları alıyoruz. Döngü, kullanıcının gireceği sayı adedince çalışacak.
            System.out.print("Sayı " + (i + 1) + ": ");//Kullanıcıdan sayı girmesini istemek için ekrana bir mesaj yazdırılıyor.
            sayilar[i] = scanner.nextDouble();//Kullanıcının girdiği sayıları diziye kaydediyoruz.
        }

        double harmonicMortal = Harmonic(sayilar);//harmonicm metodunu çağırarak hesaplanan harmonik ortalama değerini alıyoruz.

        System.out.println("Harmonik Ortalama: " + harmonicMortal);//Hesaplanan harmonik ortalama değerini ekrana yazdırıyoruz.
    }
}

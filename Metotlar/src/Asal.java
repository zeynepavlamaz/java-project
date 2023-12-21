import java.util.Scanner;
public class Asal {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("SAYI GİRİNİZ : ");
        int sayi = scanner.nextInt();


        // i = 2'den başlattık çünkü asal sayının tanımından dolayı
        // 1'den büyük ve kendisinden ve 1'den başka pozitif tam sayı böleni olmayan sayılar olarak tanımlanır
        if(asalsayi(sayi,2))
        {
            System.out.println(sayi+" sayısı ASALDIR !");
        }else {
            System.out.println(sayi+" sayısı ASAL değildir !");
        }
    }

    public static boolean asalsayi(int sayi, int i)
    {
        if(sayi<=2)
        {
            return (sayi == 2) ? true : false;
        }

        //Asal sayıların tanımına göre, bir sayının asal olup olmadığını
        // kontrol etmek için sayının kareköküne kadar olan sayılara bakmak yeterlidir.
        if(i*i > sayi) {
            return true;
        }

        if (sayi % i == 0)
        {
            return false;
        }

        return asalsayi(sayi,i+1);

    }
}

/*

--Main Metodu Çalıştırma Adımları:

1-Kullanıcıdan bir sayı girmesi istenir ve bu sayı "sayi" değişkenine atanır.
2-"asalsayi" metoduna "sayi" ve 2 parametreleriyle çağrı yapılır.
3-"asalsayi" metodunun dönüş değeri kontrol edilir:
4-Eğer dönüş değeri true ise, "sayi" asal olarak kabul edilir ve "sayi sayısı ASALDIR !" şeklinde ekrana yazdırılır.
5-Eğer dönüş değeri false ise, "sayi" asal değil olarak kabul edilir ve "sayi sayısı ASAL değildir !" şeklinde ekrana yazdırılır.


--asalsayi Metodu Adımları:

1-Metoda verilen "sayi" ve "i" parametreleri alınır.
2-Eğer "sayi" 2'den küçükse, bu durumda sadece 2 asal sayıdır, bu nedenle "sayi" 2'ye eşitse true döndürülür, aksi takdirde false döndürülür.
3-Eğer "i * i" (i'nin karesi) "sayi"den büyükse, bu durumda sayı asaldır ve true döndürülür.
4-Eğer "sayi" "i"'ye bölünüyorsa, sayı asal değildir ve false döndürülür.
5-Eğer yukarıdaki şartlar sağlanmazsa, "asalsayi" metoduna "i+1" ile rekürsif çağrı yapılır.


--Örneğin, "sayi" olarak 7 girildiğinde:

"asalsayi" metoduna 7 ve 2 parametreleri ile çağrı yapılır.
"sayi" 2'den büyük ve "i" 2'dir. "i * i" (2 * 2) 7'den küçüktür, bu nedenle devam edilir.
"sayi" 2'ye bölünmez, bu nedenle devam edilir.
"asalsayi" metoduna "sayi" (7) ve "i+1" (3) ile rekürsif çağrı yapılır.
Bu adımlar tekrarlanır ve sonunda sayı asal olduğu için true döndürülür.
Main metodu, "sayi sayısı ASALDIR !" şeklinde ekrana yazar.

*/
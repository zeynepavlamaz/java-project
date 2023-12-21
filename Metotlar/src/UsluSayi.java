import java.util.Scanner; // java.util paketindeki scanner sınıfı dahil edildi

public class UsluSayi {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // scanner nesnesi oluşturduk bu nesne kullanıcıdan veri almak için kullanılacak

        System.out.println("Taban giriniz :");// taban için veri alındı
        int taban = scanner.nextInt();

        System.out.println("Üs giriniz");// us için veri alındı
        int us = scanner.nextInt();

        // üslü sayılarda girdi bu şarta uyuyorsa sonuç belirsizdir
        if (us == 0 && taban == 0)
        {
            System.out.println("Belirsiz ifade");
            return;
        }

        // belirsiz ifade yoksa metot çağrıldı
        int result = uslusayi(taban, us);
        System.out.println("Sonuç: " + result);
    }

    public static int uslusayi(int taban, int us)
    {
        // uslu sayı kuralı
        if (taban == 0)
            return 0;

        //uslu sayı kuralı
        if (us == 0)
            return 1;

        return taban * uslusayi(taban, us - 1);
        // taban değeri kendisiyle çarpılır ve üs değeri bir azaltılır.
        // Bu işlem, üs değeri 0 olana kadar devam eder

        /*
        1-İlk adımda, taban * uslusayi(taban, us - 1) ifadesi 2 * uslusayi(2, 2) olur. Bu durumda, uslusayi(2, 2) ifadesi tekrar hesaplanmalıdır.
        2-İkinci adımda, uslusayi(2, 2) ifadesi 2 * uslusayi(2, 1) olur. Yine, uslusayi(2, 1) ifadesi tekrar hesaplanmalıdır.
        3-Üçüncü adımda, uslusayi(2, 1) ifadesi 2 * uslusayi(2, 0) olur. Bu sefer, us değeri sıfır olduğu için uslusayi(2, 0) ifadesi 1 döndürür.
        4-Sonuç olarak, bu ifadelerin hepsi bir araya getirilir: 2 * (2 * (2 * 1)). Bu ifade matematiksel olarak 2^3’e eşittir.
        */
    }
}

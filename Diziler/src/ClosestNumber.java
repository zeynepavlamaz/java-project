/* java.util.Arrays Java programlama dilinde dizilerle ilgili bazı işlevleri sağlayan bir yardımcı sınıftır.
Bu sınıf, diziler üzerinde sıralama, dizi elemanlarını karşılaştırma, belirli bir değeri dizide arama ve
dizi elemanlarını belirli bir değere göre sıralama gibi işlemleri gerçekleştirmek için kullanılır.
java.util.Arrays sınıfı, bu tür işlemleri yapabilmek için çeşitli metodları içerir.
*/
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args) {
        // Dizi tanımlama
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(dizi);
        // Kullanıcıdan bir sayı girmesini isteme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        // En yakın küçük ve büyük sayıları bulma
        int enYakinKucuk = dizi[0]; // Dizinin ilk elemanı
        int enYakinBuyuk = dizi[0]; // Dizinin ilk elemanını al
        for (int j : dizi) {
            // Dizinin elemanı girilen sayıdan küçükse
            if (j < sayi) {
                // Dizinin elemanı en yakın küçük sayıdan büyükse
                if (j > enYakinKucuk) {
                    // En yakın küçük sayıyı güncelleme
                    enYakinKucuk = j;
                }
            }
            // Dizinin elemanı girilen sayıdan büyükse
            if (j > sayi) {
                // En yakın büyük sayıyı güncelleme
                enYakinBuyuk = j;
                // Döngüden çık
                break;
            }
        }
        // Sonuçları ekrana yazdırma
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
    }
}
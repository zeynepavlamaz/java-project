import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        // Bir HashMap nesnesi oluşturuyoruz
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // Metni kelimelere ayırıyoruz
        String[] kelimeler = metin.split(" ");

        // Diziyi döngüyle dolaşıyoruz
        for (String kelime : kelimeler) {
            // Eğer kelime HashMap'de varsa, değerini bir artırıyoruz
            if (hashMap.containsKey(kelime)) {
                hashMap.put(kelime, hashMap.get(kelime) + 1);
            }
            // Eğer yoksa, kelimeyi HashMap'e ekliyoruz ve değerini 1 olarak belirliyoruz
            else {
                hashMap.put(kelime, 1);
            }
        }

        // En yüksek değere sahip kelimeyi ve sayısını tutmak için değişkenler tanımlıyoruz
        String enCokGecenKelime = "";
        int enCokGecenSayi = 0;

        // HashMap'i döngüyle dolaşıyoruz
        for (String key : hashMap.keySet()) { // Her keyi geziyoruz
            int deger = hashMap.get(key); // Keye karşılık gelen değeri alıyoruz

            if (deger > enCokGecenSayi) {
                enCokGecenKelime = key;
                enCokGecenSayi = deger;
            }
        }

        System.out.println("Metinde en çok geçen kelime: " + enCokGecenKelime);

    }
}
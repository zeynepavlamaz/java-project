import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    public static void main(String[] args) {
        // Kullanıcıdan dizinin boyutunu almak için bir Scanner nesnesi oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        // Dizinin boyutunu tutmak için bir int değişkeni tanımlıyoruz
        int n = scanner.nextInt();
        // Dizinin boyutunun pozitif olup olmadığını kontrol ediyoruz
        if (n <= 0) {
            // Eğer değilse, bir hata mesajı yazdırıyoruz ve programı sonlandırıyoruz
            System.out.println("Dizinin boyutu pozitif bir sayı olmalıdır.");
            return;
        }
        // Dizinin boyutuna göre bir int dizisi oluşturuyoruz
        int[] array = new int[n];
        // Diziyi, kullanıcıdan alınan elemanlarla doldurmak için, bir for döngüsü kullanıyoruz
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            // Kullanıcıya hangi elemanı girmesi gerektiğini belirten bir mesaj yazdırıyoruz
            System.out.print((i + 1) + ". Elemanı : ");
            // Dizinin bir sonraki elemanına bir değer atıyoruz
            array[i] = scanner.nextInt();
        }
        // Dizideki elemanları küçükten büyüğe sıralamak için, Arrays sınıfının sort() metodunu kullanıyoruz
        Arrays.sort(array);
        // Sıralanmış diziyi ekrana yazdırıyoruz
        System.out.println("Sıralama : " + Arrays.toString(array));
    }
}
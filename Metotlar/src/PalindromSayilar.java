import java.util.Scanner;
// scanner sınıfı dahil edildi

public class PalindromSayilar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // kullanıcıdan veri alabilmek için scanner nesnesi oluşturuldu
        System.out.print("Bir sayı girin: "); // kullanıcıdan kontrol edilecek olan sayı alındı
        int number = scanner.nextInt(); // kullanıcıdan alınan veri number değişkenine atandı

        if (isPalindrome(number)) //isPalindrome metoduna number değişkenini parametre olarak gönderildi ve metot çağrıldı
        {
            System.out.println(number + " bir palindrom sayıdır.");
        } else
        {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    // static metot oluşturmamız lazım dışarıdan erişilebilmesi için
    public static boolean isPalindrome(int number)
    //T-F bir değer döneceği için boolen değişkeni kullanıldı
    //java jargonunda, metodun başında eğer "is" takısı varsa T-F değer döndürür demektir
    {
        int reverse = 0;// sayının tersi hesaplanırken belleğin stack kısmında tutulacak

        int originalNumber = number;// number yerel bir değişken numberı burda kullanamayız
        // o yüzden geçici değişkene atadık eğer değişkenleri de static tanımlasaydık kullanabilirdik

        while (number != 0) // sayı 0'a eşit değilse döngü true algılar ve çalışır
        {
            int digit = number % 10; // sayının son basamağını bulmak istediğimizde mod işlemini yapıyoruz
            reverse = reverse * 10 + digit; // reverse = 0 * 10 + digit reverse ye burda yeni sayının son basamağı atandı
            number /= 10; // birler basamağını silmek için 10a bölüp numbera atadık
        }

        return originalNumber == reverse; // bulunan sonuc return ile if koşuluna dönüyor ve işleme tabi tutuluyor
    }
}
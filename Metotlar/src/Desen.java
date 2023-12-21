import java.util.Scanner;

public class Desen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        //kullanıcıdan veri alındı.
        int n = scanner.nextInt();
        //alınan veri argüman olarak metoda atandı ve metot çağırıldı.
        recursiveMetod(n);
    }

    public static void recursiveMetod(int n)// parametre olarak girilen sayı alındı
    {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursiveMetod(n - 5);
        System.out.println(n);// kalan kısım burası 
    }
}

/*
örnek n = 10
recursiveMetod(10) çağrılır.
n 0’dan büyük olduğu için, 10 yazdırılır.
recursiveMetod(5) çağrılır (10 - 5 = 5).
n hala 0’dan büyük olduğu için, 5 yazdırılır.
recursiveMetod(0) çağrılır (5 - 5 = 0).
Şimdi n 0’a eşit olduğu için, 0 yazdırılır ve metot sonlanır.
Ancak, metot sonlandığında, çağıran metodun kalan kısmına geri döneriz. Bu durumda, recursiveMetod(5)'in kalan kısmına geri döneriz ve tekrar 5 yazdırılır.
Sonra, recursiveMetod(10)'un kalan kısmına geri döneriz ve tekrar 10 yazdırılır.
*/


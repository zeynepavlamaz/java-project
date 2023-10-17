import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        arr();
    }

    public static void arr() {
        Scanner input = new Scanner(System.in);
        int index;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        try {
            System.out.print("İndeks giriniz :");
            index = input.nextInt();
            System.out.println(index + ". index de bulunan değer : " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata yakalandı !");
            System.out.println("Girilen index değeri array sınırları dışındadır !!!!");
        }

    }

}
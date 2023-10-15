import java.util.Arrays;
public class TekrarEdenÇiftSayilar {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    // Çift sayı olup olmadığını kontrol eden bir metod
    static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        int[] list = {3, 8, 3, 3, 3, 3, 9, 32, 35, 5, 98, 6, 6};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i]) == list[j]) {
                    // list[i] değerinin çift olup olmadığını kontrol ediyoruz
                    if (isEven(list[i]) && !isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            // value değişkeninin çift olup olmadığını kontrol ediyoruz.
            if (value != 0 && isEven(value)) {
                System.out.println(value);
            }
        }
    }
}
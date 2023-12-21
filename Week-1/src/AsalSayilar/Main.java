package AsalSayilar;
public class Main {

        public static void main(String[] args) {
            System.out.println("1 - 100 arasındaki asal sayılar:");

            for (int sayi = 2; sayi <= 100; sayi++) {
                boolean asal = true;

                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        asal = false;
                        break;
                    }
                }

                if (asal) {
                    System.out.print(sayi + " ");
                }
            }
        }
    }


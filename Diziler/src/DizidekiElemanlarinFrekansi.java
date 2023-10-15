public class DizidekiElemanlarinFrekansi{
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 10, 30, 20, 5, 20};

        int[] frequencies = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            frequencies[i] = 0; // Başlangıçta frekansı 0 olarak ayarlıyoruz

            int count = 1; // Elemanın frekansını saymak için sayaç kullanıyoruz
            for (int j = i + 1; j < array.length; j++) {
                if (num == array[j]) {
                    count++;
                }
            }

            // Daha önce hesaplanan frekansları kontrol ediyoruz
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (num == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Eğer daha önce hesaplanmadıysa frekansı ayarlıyoruz
            if (!isDuplicate) {
                frequencies[i] = count;
            }
        }

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < array.length; i++) {
            if (frequencies[i] != 0) {
                System.out.println(array[i] + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }
    }
}
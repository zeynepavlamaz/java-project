import java.util.Arrays;
public class MatrisBYazdırma {
    public static void main(String[] args)
    {
        //7 satır ve 5 sütundan oluşan bir iki boyutlu dizi oluşturuluyor
        String[][] letter = new String[7][5];

        // Dizinin elemanlarını doldurmak için iki döngü kullanılıyor
        for (int i = 0; i < letter.length; i++)
        {
            for (int j = 0; j < letter[i].length; j++)
            {
                // "B" harfinin asterisk (*) içeren şeklini oluşturmak için koşullar belirleniyor
                if (i == 0 || i == 3 || i == 6)
                {
                    letter[i][j] = " * ";// Satırın üst, orta ve alt kısımları
                }
                else if (j == 0 || j == 4)
                {
                    letter[i][j] = " * ";// Sol ve sağ kenarlar
                }
                else
                {
                    letter[i][j] = "   ";//// Sol ve sağ kenarlar
                }
            }
        }
        // Oluşturulan "B" harfinin şeklini ekrana basma işlemi
        for (String[] row : letter)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
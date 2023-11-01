import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class DosyaOkumaToplama {
    public static void main(String[] args) {
        try {
            File file = new File("src/numbers.txt");
            FileReader input = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(input);

            String line;
            int sum = 0;

            while ((line = buffReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }

            System.out.println(sum);

            input.close();
            buffReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
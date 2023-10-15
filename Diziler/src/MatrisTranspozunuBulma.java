import java.util.Arrays;

public class MatrisTranspozunuBulma{
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Transpoze:");
        for (int i = 0; i < columns; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}
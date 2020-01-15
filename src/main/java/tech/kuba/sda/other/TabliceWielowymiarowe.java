package tech.kuba.sda.other;

import java.util.Arrays;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[] row = matrix[0];
//        int cell1 = row[0];
//        int cell2 = matrix[0][0];
//        matrix[0][0] = 5;
//        matrix[1] = new int[] {5, 6, 7};

        for(int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }

        for(int[] row : matrix) {
            for(int cell : row)
                System.out.print(cell);
        }
        System.out.println();

        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }
}

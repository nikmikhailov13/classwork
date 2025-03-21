package gmail.nikmikhailov13;

import gmail.nikmikhailov13.lesson25.Util;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        print(matrix);
        System.out.println();
        System.out.println("Reversing matrix...");

        int[][] reversedMatrix = Util.reverse(matrix);
        print(reversedMatrix);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
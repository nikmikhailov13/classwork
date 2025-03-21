package gmail.nikmikhailov13.lesson25;

public class Util {

    public static int[] reverse (int [] array){
        // 1, 2, 3, 4, 5 -> 5, 4, 3, 2, 1
        int [] reversedArray = new int[array.length];

        int j = array.length - 1;
        for(int i = 0; i < array.length; i++){
            reversedArray[j] = array[i];
            j--;
        }

        return reversedArray;
    }

    public static int[][] reverse (int [][] matrix){
        // 1 2  - 4 3
        // 3 4  - 2 1

        int [][] reversedMatrix = new int[matrix[0].length][matrix.length];

        int k = matrix.length - 1;

        for(int i = 0; i < reversedMatrix.length; i++){
            int l = matrix[0].length - 1;
            for(int j = 0; j < reversedMatrix[0].length; j++){
                reversedMatrix[i][j] = matrix[k][l];
                l--;
            }
            k--;
        }
        return reversedMatrix;
    }
}

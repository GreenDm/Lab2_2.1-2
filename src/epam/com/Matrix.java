package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Matrix {

    //бьявляем метод
    public int[][] add(int[][]arr1, int[][] arr2){
        // создаем результат и обьявляем двух мерный массив.
        int [][] result = new int[2][2];

        for (int i = 0; i<result.length; i++){

            for (int j =0; j<result[i].length; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
    public int[][] multiplication(int [][] arr1, int[][] arr2){
        int [][] result = new int[2][2];

        for(int i = 0; i<result.length; i++){

            for(int j=0; j<result[i].length; j++){

                int multiplication = 0;

                for(int r = 0; r<arr1.length;r++){

                    multiplication += arr1[i][r]* arr2 [r][j];
                }
                result [i][j] = multiplication;
            }
        }
        return result;
    }
}

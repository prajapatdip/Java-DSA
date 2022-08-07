import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
                1 2 3
                3 4 5
                6 7 8
         */

        /*
        int[][] arr = new int[3][];     //Defining of column is not mandatory.

        int[][] arr2 = {
                {1, 2, 3},      //0th index.
                {4, 5},         //1st index.
                {6, 7, 8, 9}    //2nd index. -> arr2[2] = {6, 7, 8, 9}
        };
         */

        //input
        Scanner in = new Scanner(System.in);
        int[][] arr3 = new int[3][3];

        for (int row = 0; row < arr3.length; row++) {
//            for each column in row
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = in.nextInt();
            }
        }

        //Output
        for (int row = 0; row < arr3.length; row++) {
//            for each column in row
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col]+ " ");
            }
            System.out.println();
        }

        //Simple form
        for (int row = 0; row < arr3.length; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }

        //for-each loop
        for (int[] num: arr3){
            System.out.println(Arrays.toString(num));
        }
    }
}

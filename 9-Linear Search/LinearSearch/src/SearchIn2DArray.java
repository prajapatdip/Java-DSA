import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] num = {
                {1, 9, 23},
                {34, 65, 87, 25, 78},
                {25, 58, 24, 67, 24, 747},
                {13, 34, 75, 856}
        };
        int target = 24;
        System.out.println(Arrays.toString(search(num, target)));   //return in the formate {row, column}
    }
    //Assume that array is not empty.
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

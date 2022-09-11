import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,10)));
    }

    //Search in the row provided between the columns provided.
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            else if (matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix may be empty.

        if (cols == 0){
            return new int[] {-1,-1};
        }

        if (rows == 1){
            return binarySearch(matrix,0,0,cols - 1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        //run the loop till the 2 rows are remaining.

        while (rStart < (rEnd - 1)){ // while this is true it will have more than 2 rows.
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[] {mid, cMid};
            }
            else if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        // now we have the rows
        //check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }
        else if (matrix[rStart + 1][cMid] == target){
            return new int[] {rStart + 1, cMid};
        }

        //Search in 1st half
        else if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix,rStart,0,cMid - 1,target);
        }
        //Search in 2nd half
        else if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix,rStart,cMid + 1,cols - 1,target);
        }
        //Search in 3rd half
        else if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix,rStart + 1,0,cMid - 1, target);
        }
        //Search in 4th half
        else {
            return binarySearch(matrix,rStart + 1,cMid + 1,cols - 1,target);
        }
    }
}

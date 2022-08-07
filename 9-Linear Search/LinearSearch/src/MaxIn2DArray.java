public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] num = {
                {1, 9, 23},
                {34, 65, 87, 25, 78},
                {25, 58, 24, 67, 24, 747},
                {13, 34, 75, 85}
        };
        int ans = max(num);
        System.out.println(ans);
    }
    //Finding the maximum value in the 2D array.
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints: arr){
            for (int element: ints){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}

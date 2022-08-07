public class MinVal {
    public static void main(String[] args) {
        int[] num = {23, 1, 5, 33, 23, -1, 45, 22, -2};
        System.out.println(minVal(num));
    }
    static int minVal(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

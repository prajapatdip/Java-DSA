public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 42, 56, 1, 774};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    //Work on edge cases, like array being null.
    static int max(int[] num){
        if (num.length == 0){
            return -1;
        }
        int maxVal = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxVal){
                maxVal = num[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] num, int start, int end){
        if (num.length == 0){
            return -1;
        }
        if (start > end){
            return -1;
        }
        int maxVal = num[start];
        for (int i = 1; i < end; i++) {
            if (num[i] > maxVal){
                maxVal = num[i];
            }
        }
        return maxVal;
    }
}

/*
410. Split array largest sum.
 */

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }

    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int element: arr) {
            start = Math.max(start, element); //In the end of loop this will contain the max item from the array.
            end += element;
        }

        //binary search
        while (start < end){
            //try for the middle as potential ans.
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            //calculate how many pieces you can divide this in with this max sum.
            for (int num: arr){
                //you cannot add this in this subarray, make new one.
                //say you add this in new subarray, then sum = num.
                if (sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}

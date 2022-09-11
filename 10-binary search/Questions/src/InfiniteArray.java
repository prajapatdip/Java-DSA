/*
Finding the element using binary search in the infinite array without using arr.length.
 */

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6,9,13,20,
                    23,33,45,46,74,78,82,88,94,99,100};
        int target = 33;
        System.out.println("Found at index: "+ans(nums,target));
    }
    static int ans(int[] arr, int target){
        //First find the range
        //First start with box size of 2.
        int start = 0;
        int end = 1;

        //Condition for the target to lie in the range.
        while (target > arr[end]){
            int newStart = end + 1; //this is new start

            //double the box size
            //end = previous end + (box size) * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

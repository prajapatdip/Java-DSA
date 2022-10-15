import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] nums) {
        //assign length for easiness.
        int n = nums.length;
        // for finding the index of the maximum number.
        int index = -1;
        // searching from right to left for first maximum from right.
        for (int i = n - 1 ; i > 0; i--) {
            if (nums[i] > nums[i - 1]){
                index = i - 1;
                break;
            }
        }
        // maximum is found at 0th index then reversing the array(condition)
        if (index == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        
        int j = n - 1;
        for (int i = n - 1; i >= index + 1 ; i--) {
            if (nums[i] > nums[index]){
                j = i;
                break;
            }
        }
        swap(nums, index, j);
        reverse(nums, index + 1, n - 1);
    }
    static void reverse(int[] arr, int first, int last){
        while (first < last){
            swap(arr, first, last);
            first++;
            last--;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,-1,-2,-3};
        selectionMin(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max index in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr,0,last);
            swap(arr,MaxIndex,last);
        }
    }

    //selection sort using minimum element.
    static void selectionMin(int[] arr){
        for (int i=0; i < arr.length; i++){
            int first = i;
            int MinIndex = getMinIndex(arr,first, arr.length - 1);
            swap(arr,MinIndex,first);
        }
    }

    static int getMinIndex(int[] arr, int start, int end){
        int min = start;
        for (int i=start; i<= end; i++){
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

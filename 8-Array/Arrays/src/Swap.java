import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89,53};
        System.out.println(Arrays.toString(arr));
//        swap(arr, 2,4);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Reversing the array using the swap method
    static void reverse(int[] num){
        int start = 0;
        int end = num.length-1;
        while (start < end){
            swap(num, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
}

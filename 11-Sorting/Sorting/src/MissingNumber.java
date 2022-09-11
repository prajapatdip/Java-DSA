
//268. Find the Missing Number

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        System.out.println(number(arr));
    }
    static int number(int[] arr){
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

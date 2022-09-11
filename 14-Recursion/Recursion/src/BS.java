public class BS {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,11,34,56};
        System.out.println(search(arr,56,0, arr.length - 1));
    }
    static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] > target){
            return search(arr,target,start,mid - 1);
        }
        else {
            return search(arr,target,mid + 1, end);
        }
    }
}

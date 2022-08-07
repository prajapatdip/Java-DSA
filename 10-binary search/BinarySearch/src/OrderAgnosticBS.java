//Used when we don't know the whether the array is in the ascending or descending order.

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] num = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] num2 = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;
        System.out.println(orderAgnosticBS(num, target));
        System.out.println(orderAgnosticBS(num2, target));
    }
    static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

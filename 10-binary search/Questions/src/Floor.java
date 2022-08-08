//Floor number means the biggest number less than equal to target number.

public class Floor {
    public static void main(String[] args) {
        int[] nums = {1,5,9,12,15,16,18,23,30};
        int target = 17;
        System.out.println(floorNo(nums, target));
        int[] nums2 = {30,23,18,16,15,12,9,5,1};
        System.out.println(floorNo(nums2,target));
    }
    static int floorNo(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        boolean isAsc = arr[start] < arr[end];

        // But what if the target is grater than the gratest number in the array.
        if (isAsc){
            if (target > arr[end]) {
                System.out.println("Element is grater than the gratest number in the array.");
                return -1;
            }
            else if (target < arr[start]){
                System.out.println("Element is grater than the gratest number in the array.");
                return -1;
            }
        }
        else if (arr[start] > arr[end]){
            if (target < arr[end]) {
                System.out.println("Element is grater than the gratest number in the array.");
                return -1;
            }
            else if (target > arr[start]){
                System.out.println("Element is grater than the gratest number in the array.");
                return -1;
            }
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return arr[mid];
            }

            else if(isAsc){
                // But what if the target is grater than the gratest number in the array.
                    /*if (target > arr[end]){
                        System.out.println("Element is grater than the gratest number in the array.");
                        return -1;
                    }
                     */

                if (target > arr[mid]){
                    start = mid + 1;
                }
                else if (target < arr[mid]){
                    end = mid - 1;
                }
            }
            else {

                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        if (isAsc){
            ans = arr[end];
        }
        else {
            ans = arr[start];
        }
        return ans;
    }
}

/*
33.Search in rotated sorted array.
 */

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(nums,target));
    }

    static int search(int[] arr, int target){

        int pivot = findPivot(arr);

        //if you did not find a pivot, it means the array is not rotated.
        if (pivot == -1){
            //Just do normal binary search.
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        //if pivot is found, you have found two asc sorted arrays.
        else {
            if (target == arr[pivot]) {
                return pivot;
            }
            else if (target > arr[0]){
                return binarySearch(arr, target, 0, pivot - 1);
            }
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //This will not work for duplicate values.
    static int findPivot(int arr[]){
        //finding the index of the element where the rotation will started.
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int arr[]){
        //finding the index of the element where the rotation will started.
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //If elements at middle, end, and start are equal then just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //Skip the duplicates
                //NOTE: what if these elements at start & end were the pivots??
                //check if the start is pivot.
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check whether end is pivot.
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right.
            else if (arr[mid] > arr[start] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

/*
1095. Find in Mountain Array.
Finding the specific element in the mountain array
 */

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);

        int ans = orderAgnosticBS(arr,target,0,peak);
        if (ans != -1){
            return ans;
        }
        return orderAgnosticBS(arr, target,peak + 1,arr.length - 1);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid + 1] < arr[mid]){
                //You are in the decreasing part of the array.
                //this may be ans, but look at the left.
                //this is why end != mid - 1.
                end = mid;
            }
            else{
                //You are in the ascending part of the array.
                start = mid + 1;    //because you know middle + 1 element > middle element.
            }
        }
        //in the end, start == end and pointing towards the largest element in the array,because of the above 2 checks.
        //start & end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the check say.
        //more elaboration: at every point of time for start & end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence because of above line that is the best possible ans.
        return start; // or return end;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if (isAsc) {
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
        return - 1;
    }
}

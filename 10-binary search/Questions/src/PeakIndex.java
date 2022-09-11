/*
852.Peak index in the mountain array.
Finding the index of peak element in mountain arrray.
 */

public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(peakIndexInMountainArray(nums));
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
}

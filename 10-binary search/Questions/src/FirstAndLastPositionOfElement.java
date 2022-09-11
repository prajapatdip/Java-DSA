import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        //check for first occurrence if target is first.
        /*
        int start = search(nums, target, true);

        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;
         */

        // Or

        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    //This function just return the index value of target.
    static int search(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                //Potential answer found.
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

//448. Find all numbers disappeared in an array
//asked in google

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumber(arr));
    }
    static List<Integer> findDisappearedNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        // find the missing numbers.
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

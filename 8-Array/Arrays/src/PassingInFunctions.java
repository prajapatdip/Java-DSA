import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {23, 343, 65, 6567, 67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

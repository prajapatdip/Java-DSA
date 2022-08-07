public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {2, 43, 46, 75, 63, 25, 856};
        int target = 75;
        System.out.println(searchInRange(num, target, 1, 5));
    }
    static boolean searchInRange(int[] arr,int target, int index1, int index2){
        if (arr.length == 0){
            return false;
        }
        for (int i = index1; i <= index2 ; i++) {
            if (target == arr[i]){
                return true;
            }
        }
        return false;
    }
}

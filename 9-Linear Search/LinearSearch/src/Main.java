public class Main {
    public static void main(String[] args) {
        int[] num = {12, 02, -22, 214, 55, 78, 687, 768};
        int target = 78;
//        int ans = search(num, target);
//        System.out.println(ans);
        search1(num, target);
        boolean ans = search2(num, target);
        System.out.println(ans);
    }

    /*
    //Returning the index of element, if the element is found in the array.
    // otherwise return -1.
    static int search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop.
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target.
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //This line will execute if none of the return statement above have executed.
        //hence target is not found.
        return -1;
    }
     */

    //Return the element value if it is found in the array.
    static void search1(int[] arr, int target){
        int temp = 0;
        if (arr.length == 0){
            System.out.println("Array is empty.");
        }
        for (int element: arr) {
            if (element == target){
                temp = element;
            }
        }
        if (temp == target){
            System.out.println("Target is found: "+temp);
        }
        else {
            System.out.println("Target is not found!!");
        }
    }

    //Return true if element is found in the array.
    //otherwise return false.
    static boolean search2(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int element: arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
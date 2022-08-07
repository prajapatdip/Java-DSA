import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i=0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        //for loop to print the array.
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        //for-each loop to print the array.
        for (int x: arr){           //for every element in the array, print the element.
            System.out.println(x);  //here x represent element of the array.
        }

        //simple methode to print array.
        System.out.println(Arrays.toString(arr));
    }
}

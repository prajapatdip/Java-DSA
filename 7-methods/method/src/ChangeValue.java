import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = {3, 5, 22, 44, 123};
        change(arr);
        System.out.println(Arrays.toString(arr));   //To print the values present in the array.
    }
    static void change(int value[]){
        value[0] = 12;  //If you make change to the object via this ref. variable, the same object will be changed.
    }
}

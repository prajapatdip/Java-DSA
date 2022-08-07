import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(45);
//        list.add(456);
//        list.add(234);
//        list.add(8567);
//        list.add(4,954);
//
//        System.out.println(list);
//        list.set(1, 99);        //To modify the element.
//        System.out.println(list);
//        list.remove(3);     //To remove element.
//        System.out.println(list);
        
        //Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //Output
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));    //pass index here, list[index] will not work here.
        }

        //Or
        System.out.println(list);
    }
}

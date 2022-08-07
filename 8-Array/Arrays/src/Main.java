public class Main {
    public static void main(String[] args) {

//        Q: store a roll number.
        int rno = 23;

//        Q: store a name.
        String name = "Dip";

//        Q: store five roll numbers.
//        int[] reno = new int[5];
//        int[] reno = {23, 45, 64, 66, 67};

        int[] reno; //Declaration of array. reno is getting defined in the stack.
        reno = new int[5];  //actually here object is being created in the memory (heap).
    }
}
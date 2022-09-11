public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a+ " " +b);  //Not swap because new object is created.
    }
    static void swap(int c, int d){
        int temp = c;
        c = d;      //Creating new object.
        d = temp;

        //This change only be valid in this function scope only.
    }
}

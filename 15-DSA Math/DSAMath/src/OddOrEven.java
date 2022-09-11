public class OddOrEven {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isOdd(n));
        oddEven(n);
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    static void oddEven(int n){
        if ((n & 1) == 1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
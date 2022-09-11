public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursion call
        //if you are calling function again and again, you can treat it as a separate call in a stack.

        //this is called tail recursion
        //this is the last function call
        print(n + 1);
    }
}

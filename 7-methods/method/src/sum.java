import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        sum2();
        System.out.println(sum3(34, 44));
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = in.nextInt();
        System.out.print("Enter the num2: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }

    // pass the value while calling the function.
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = in.nextInt();
        System.out.print("Enter the num2: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum is: "+sum);
    }
}

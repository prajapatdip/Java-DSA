//Finding square root by newton raphson method

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }
    static double sqrt(double n){
        double x = n;
        double root;

        while (true){
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 1){        //Condition for error
                break;
            }
            x = root;
        }
        return root;
    }
}

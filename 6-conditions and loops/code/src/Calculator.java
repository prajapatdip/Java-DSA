import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Taking input from user till user does not enter X or x.
        int ans = 0;
        while (true){
            System.out.print("Enter the operation: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //Taking two numbers.
                System.out.print("Enter the two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+'){
                    ans = a + b;
                }
                else if (op == '-'){
                    ans = a - b;
                }
                else if (op == '*'){
                    ans = a * b;
                }
                else if (op == '/'){
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                else if (op == '%'){
                    ans = a % b;
                }
            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}

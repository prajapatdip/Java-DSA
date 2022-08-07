import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        Q: find the largest of 3 numbers
//        1st way
        /*int max = a;
        if (b > max){
            max = b;
        }
        else if (c > max) {
            max = c;
        }*/

//        2nd way
        /*int max = 0;
        if (a > b){
            max = a;
        }
        else {
            max = b;
        }
        if (c > max){
            max = c;
        }*/

//        3rd way
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}

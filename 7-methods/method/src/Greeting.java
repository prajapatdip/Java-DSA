import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
        greet1();
        System.out.println(greet3("Hello"));
    }
    static String greet1(){
        Scanner in = new Scanner(System.in);
        String greet = in.nextLine();
        return greet;
    }

    static String greet3(String greet){
        return greet;
    }

    static void greet(){
        Scanner in = new Scanner(System.in);
        String greet = in.nextLine();
        System.out.println(greet);
    }
}

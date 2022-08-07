import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = in.next();

        switch (fruit){
            case "Mango" -> System.out.println("King of fruits.");
            case "Apple" -> System.out.println("A sweet red fruit.");
            case "Orange" -> System.out.println("A round fruit.");
            case "Grapes" -> System.out.println("A small fruit.");
            default -> System.out.println("Please enter a valid fruit name!!");
        }
    }
}

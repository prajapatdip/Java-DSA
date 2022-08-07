import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int empId = in.nextInt();

        System.out.print("Enter Department name: ");
        String depmt = in.next();

        switch (empId){
            case 1 -> System.out.println("Dip Prajapat");
            case 2 -> System.out.println("Nirav Prajapat");
            case 3 ->{
                System.out.println("Emp no. 3.");
                switch (depmt){
                    case "IT" -> System.out.println("IT Department.");
                    case "Management" -> System.out.println("Management Department.");
                    default -> System.out.println("No such Department.");
                }
                break;
            }
            default -> System.out.println("Enter a valid employee number!!");
        }
    }
}

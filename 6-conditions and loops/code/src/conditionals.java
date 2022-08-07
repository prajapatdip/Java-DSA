import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
//        if else
        /*if (salary>10000){
            salary = salary + 2000;
        }
        else {
            salary += 1000;
        }*/

//        Multi if else
        if (salary>10000){
            salary += 2000;
        }
        else if (salary>20000){
            salary += 3000;
        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}

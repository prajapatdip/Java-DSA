import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        //This is same as after a few steps: "a" + "1"
        //integer will be converted to Integer that will call toString()
        System.out.println("Dip" + new ArrayList<>());
        System.out.println("Dip" + new Integer(56));

        //This will give error: '+' operator is used for only primitive datatypes
        //other it will contain one string.
        //System.out.println(new Integer(56) + new ArrayList<>());

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}

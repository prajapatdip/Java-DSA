import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4,6,7,8);
        fun2(3,3,"aad","asdfa");
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void fun2(int a, int b, String ...v){
        System.out.println(a+ " " +b);
        System.out.println(Arrays.toString(v));
    }
}

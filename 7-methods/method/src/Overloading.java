public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(23,45));
        System.out.println(sum(23,45,55));
        fun(2);
        fun("dip");
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b +c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String x){
        System.out.println(x);
    }
}

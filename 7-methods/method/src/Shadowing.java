public class Shadowing {
    static int x = 90;      //This will be shadowed at line 5.
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x;         //The class variable at line 2 is shadowed by this.
//        System.out.println(x);    --(error)Scope will begging when the value is initialised.
        x = 40;
        System.out.println(x);  //40
    }
    static void fun(){
        System.out.println(x);  //90
    }
}

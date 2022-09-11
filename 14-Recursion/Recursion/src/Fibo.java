public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(8));
        System.out.println(fiboFormula(50));
    }
    static int fiboFormula(int n){
        //Just for demo, use always long
        return (int)(Math.pow(((1 + Math.sqrt(5))/2), n)/ Math.sqrt(5));
    }
    static int fibo(int n){
        //base condition
        if (n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    
}

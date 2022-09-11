public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n){
        if ((n & (n - 1)) == 0){  //Note: fix for n = 0
            return true;
        }
        return false;
    }
}

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(count(n));
        System.out.println(setBits(n));
    }
    static int count(int n){
        int count = 0;

        while (n > 0){
            if ((n & 1) == 1){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    //another method
    static int setBits(int n){
        int count = 0;
        while (n > 0){
            count ++;
            //n -= (n & -n);
            //OR
            n = (n & (n - 1));
        }
        return count;
    }
}

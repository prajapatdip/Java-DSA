public class MagicNumber {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(magicNo(a));
    }
    static int magicNo(int n){
        int ans = 0;
        int base = 5;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}

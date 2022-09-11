public class RangeXOR {
    public static void main(String[] args) {
        // range xor for a to b = xor(b) ^ xor (a-1)    ( ^ is the symbol of xor)
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        //This is only for check, will give time limit exiec (TLE) for large number
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    //This will give XOR from 0 to a
    static int xor(int a){
        if (a % 4 == 0){
            return a;
        }
        if (a % 4 == 1){
            return 1;
        }
        if (a % 4 == 2){
            return a + 1;
        }
        return 0;
    }
}

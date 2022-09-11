//Formula to find the number of digits present in number n with base b

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 6;
        int base = 2;

        int ans = (int) (Math.log(num) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}


/*
log a to base b = log a / log b;
 */
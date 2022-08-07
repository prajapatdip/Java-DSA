public class EventDigits {
    public static void main(String[] args) {
        int [] num = {1, 23, -1234, 64, 132, 6467};
        int ans = findNo(num);
        System.out.println(ans);
    }
    static int findNo(int[] arr){
        int count = 0;
        for (int element: arr){
            if (even(element)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    // Optimization on digits
    static int digits2(int num){
        if (num < 0){
            num *= -1;
        }
        return (int) Math.log10(num) + 1;
    }

    static int digits(int num){
        int count = 0;
        if (num < 0){
            num = num * -1;
        }
        while (num > 0){
            count++;
            num = num/10;   //Or num /= 10;
        }
        return count;
    }
}

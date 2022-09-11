public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,6,3,5};
        System.out.println(uniqueNo(arr));
    }
    static int uniqueNo(int[] arr){
        int unique = 0;
        for (int a: arr){
            unique ^= a;
        }
        return unique;
    }
}

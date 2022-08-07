import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Nirav";
        char target = 'r';
        System.out.println(search(name, target));

        //Converting string into character array and printing it.
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search1(name, 'a'));
    }
    //Using for-each loop
    static boolean search1(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch: str.toCharArray()){
            if (target == ch){
                return true;
            }
        }
        return false;
    }

    //Using for loop
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

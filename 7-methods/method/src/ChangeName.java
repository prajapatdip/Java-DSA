public class ChangeName {
    public static void main(String[] args) {
        String name = "Nirav";
        System.out.println(chageName(name));    //Not change because new object is created.
    }
    static String chageName(String naam){
        naam = "Dip";
        return naam;
    }
}

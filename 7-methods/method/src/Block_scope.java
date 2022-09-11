public class Block_scope {
    public static void main(String[] args) {
        int a =20;

        {
//            int a = 30;       --(Error)already initialised in the same method, hence you cannot initialise agian.
            a = 30;             //Reassign the original reference variable to some other values.
            System.out.println(a);
            int c = 40;         //Value initialised in the block, will remain in the block.
        }
//        System.out.println(c);    --(Error)cannot used outside the block.
        System.out.println(a);
        int c = 99;         //Also initialised outside the block.

        // For loop also have the same scope.
        for (int i=0; i<3; i++){
            System.out.println(i);
            int b = 30;
//            int a = 10;       --Error.
        }
//        System.out.println(i);    --Error.
    }
}

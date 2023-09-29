public class es09 {
    public static void main(String[] args) {

        char x = 'r';
        char y = 'g';

        System.out.println("the result of compare is: " + compare(x,y));

    }

    public static boolean compare (char x, char y) {

        System.out.println("value of x is " + x);
        System.out.println("value of y is " + y);
        return x != y;
    }
}



public class es08 {
    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        System.out.println("the result of compare is: " + compare(x, y));

    }

    public static boolean compare (int x, int y) {

        System.out.println("value of x is " + x);
        System.out.println("value of y is " + y);
        return x != y;
    }
}



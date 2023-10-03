public class es11 {
    public static void main(String[] args) {

        int x = 15;

        evenOrOdd(x);
    }
    public static void evenOrOdd(int x) {

        if (!(x % 2 == 0)) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even");;
        }

    }
}

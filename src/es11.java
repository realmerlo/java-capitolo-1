public class es11 {
    public static void main(String[] args) {

        int x = 15;

        System.out.println("the numbers is odd? " + evenOrOdd(x));
    }
    public static boolean evenOrOdd(int x){
        return !(x % 2 == 0);
    }
}

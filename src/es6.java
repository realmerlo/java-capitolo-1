public class es6 {
    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        System.out.println("the result of incremented x * incremented y is: " + incAndMolt(x , y));

    }

    public static int incAndMolt (int x, int y){
        x += 2;
        y += 3;

        System.out.println("incremented value of x is " + x);
        System.out.println("incremented value of y is " + y);
        return x*y;
    }
}



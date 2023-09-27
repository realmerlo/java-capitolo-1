public class es10 {
    public static void main(String[] args) {

        int x = 10;
        int y = 50;
        int z =17;

        System.out.println("the value z is between min and max? " + between(x, y, z));

    }

    public static boolean between (int x, int y, int z) {

        System.out.println("min is " + x);
        System.out.println("max is " + y);
        return z >= x && z <= y;
    }
}


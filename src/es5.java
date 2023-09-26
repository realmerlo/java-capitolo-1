public class es5 {
    public static void main(String[] args) {

        double x = 12.9;
        double y = 17.5;
        double z = 14.3;

        System.out.println("the average of the numbers is: " + averageOf(x, y, z));
    }
    public static double averageOf(double x, double y, double z){
        return (x+y+z)/3;
    }
}

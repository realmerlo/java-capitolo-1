public class es12 {
    public static void main(String[] args) {
        int n = 1;
        printN(n);
    }

    public static void printN(int n) {
        if (n <= 100) {
            String stamp = "";

            if (n % 3 == 0) {
                stamp += "Fizz";
            }
            if (n % 5 == 0) {
                stamp += "Buzz";
            }
            if (stamp.isEmpty()) {
                stamp += n;
            }

            System.out.println(stamp);

            printN(n + 1);
        }
    }
}

//Scrivere un programma che stampi i numeri da 1 a 100.
//Per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
//Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

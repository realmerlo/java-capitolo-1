public class es20 {
    public static void main(String[] args) {
        int num = 18;
        printNum(num);

    }
    public static void printNum (int n) {

        for (int x = 0; x <= n; x ++) {

            if(x == 5) {
                continue;
            }
            System.out.println(x);
        }
    }
}
//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
// e stampa tutti i numeri fino al valore immesso,
// la stampa dovrà saltare il valore uguale a 5.
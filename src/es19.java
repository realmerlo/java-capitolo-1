public class es19 {
    public static void main(String[] args) {
        int num = 27;
        printNum(num);

    }
    public static void printNum (int n) {
        for (int x = 0; x <= n; x ++) {

            System.out.println(x);

            if(x == 5){
                break;
            }

        }
    }
}
//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
// e stampa tutti i numeri fino al valore immesso,
// la stampa dovrà interrompersi se il valore è uguale a 5.
public class es18 {
    public static void main(String[] args) {
        int num = 18;
        int max = 5;
        printInv(num, max);

    }
    public static void printInv (int n, int m) {
        for (int x = n; x > n - m; x --){
            System.out.println(x);}
    }
}

//Scrivi un programma che contenga un metodo che prende in ingresso un numero
// e il massimo numero di risultati che vuoi avere
// e stampi tutti i numeri naturali in ordine inverso
// (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati
// mi aspetto in uscita [6 5 4] stampati).
public class es17 {
    public static void main(String[] args) {
        int num = 9;
        tab(num);

    }
    public static void tab (int n) {
        for (int x = 1; x <=10; x ++) {
            int result = n * x;
            System.out.println(n + "x" + x + "=" + result);
        }
    }
}

//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
//e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.

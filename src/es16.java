public class es16 {
    public static void main(String[] args) {
        int lim = 12;
        printSum(lim);

    }
    public static void printSum (int limit){
        int sum = 0;
        int val = 0;
        while (val < limit) {
            sum += val;
            val ++;

        }
        System.out.println(sum);
    }
}
//Scrivere un programma che contenga un metodo che sfrutti il while loop
//e prenda in ingresso 1 valore intero come limite superiore
//e calcoli la somma di tutti i valori prima del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
public class es14 {
    public static void main(String[] args) {

    int x = 6;
    String day = getDay(x);
    System.out.println(day);
    }

    public static String getDay (int x) {
        String day;

        switch(x){
            case 1: day = "lunedi";
                break;
            case 2: day = "martedi";
                break;
            case 3: day = "mercoledi";
                break;
            case 4: day = "giovedi";
                break;
            case 5: day = "venerdi";
                break;
            case 6: day = "sabato";
                break;
            case 7: day = "domenica";
                break;
            default: day = "errore";
                break;
        }

        return day;


    }



}

//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
//e restituisca il nome del giorno della settimana come stringa
//o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
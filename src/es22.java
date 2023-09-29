import java.util.Arrays;

public class es22 {
    public static void main(String[] args) {
        int l = 10;
        char[] charArr = newArray(l);
        int counterOcc = counter(charArr, 'a');
        System.out.println(counterOcc);

    }
    public static char[] newArray (int length){
        char[] newArr = new char[length];
        for(char i = 0; i < length; i++){
            newArr[i] = (char) (i + 'a');

        }
        return newArr;
    }
    public static int counter(char[] array, char character){
        int counter = 0;
        for(char i : array){
            if (i == character){
            counter++;
            }
        }
        return counter;
    }
}
//Scrivi un programma che contenga un metodo che crea un array
//e lo riempie con dei caratteri. Questo metodo dovrà poi
// stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.


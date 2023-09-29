import java.util.Arrays;

public class es21 {
    public static void main(String[] args) {
    int l = 10;
    System.out.println(Arrays.toString(newArray(l)));
    System.out.println(sum(newArray(l)));
    }
    public static int[] newArray (int length){
        int[] newArr = new int[length];
        for(int i = 0; i < length; i++){
            newArr[i] = i + 1;
        }
        return newArr;
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i <= array.length; i++){
            sum += i;
        }
        return sum;
    }
}
//Scrivi un programma che contenga un metodo che crea un array
// e lo riempie con i numeri da 1 a 10
// e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
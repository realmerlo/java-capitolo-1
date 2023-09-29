import java.util.Arrays;

public class es23 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4, 5};
        System.out.println("original array is: " + Arrays.toString(arr1));
        newArr(arr1);
        System.out.println("new array is: " + Arrays.toString(arr1));

    }

    public static void newArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }
}
//Scrivere un programma che contenga un metodo
//che permetta di rimuovere gli elementi duplicati in un array di interi.
//L'array ottenuto dovrà essere stampato a video.

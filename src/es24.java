public class es24 {
    public static void main(String[] args){
        int[][] matrix = {{2, 4, 6}, {8, 10, 12}};

        int sum = sumRow(matrix);
        System.out.println("sum of first row element is = " + sum);

    }

    public static int sumRow (int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++){
            sum += matrix[0][i];
        }
        return sum;
    }
}
//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
//riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga
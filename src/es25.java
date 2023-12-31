public class es25 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
        System.out.println("start matrix is: ");
        printMatrix(matrix);

        checkArrayLength(matrix);

        int[][] exchangedMatrix = exchangeRC(matrix);

        System.out.println("new matrix is: ");
        printMatrix(exchangedMatrix);
    }

    public static int[][] exchangeRC(int[][] matrix) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        int[][] newMatrix = new int[numColumns][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void checkArrayLength(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != array[j].length) {
                    System.err.println("Error: the array rows and columns cant be exchanged");
                    System.exit(0);


                }
            }
        }
    }
}

/*
   Scrivere un programma che contenga un metodo che permette di inizializzare una
   e di scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza

        1 2 3
        4 5 6
        Matrice risultato

        1 4
        2 5
        3 6*/

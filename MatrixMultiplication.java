import java.util.InputMismatchException;
import java.util.Scanner;

class MatrixMultiplication{

    static int[][] calculateMult(int[][] matrixA, int[][] matrixB){
        //Declares resutlting multiplication of the two matrices
        int[][] results = new int[matrixA.length][matrixB[0].length];
        //Iterate over the rows of the first matrix
        for(int i=0; i<matrixA.length; i++){
            //Iterate columns of the matrix B
            for(int j=0; j<matrixB[0].length; j++){
                results[i][j] = 0;
                for(int k=0; k<matrixA[i].length; k++){
                    results[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return results;
        }

        
        //Prints the matrix to the console
    static void printMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows of matrix A");
        int rowA =0;
        try {
            rowA = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer only");
        }
        System.out.println("Please enter the number of columns of matrix A");
        int colA =0;
        try {
            colA = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter integer numbers only");

        }

        System.out.println("Please enter the number of rows of matrix B");
        int rowB =0;
        try {
            rowB = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter integer numbers only");

        }
        if(colA != rowB){
            System.out.println("The number of cols for A and number of rows for A must be same. Please enter the two values again");
            colA = scanner.nextInt();
            rowB = scanner.nextInt();
        }
        System.out.println("Please enter the number of cols for matrix B");
        int colB = 0;
        try {
            colB = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter integer numbers only");
        }
        int[][] mA = new int[rowA][colA];
        int[][] mB = new int[rowB][colB];
System.out.println("Please enter the values for matrix A");


//Looping through the first matrix and storing the values
for(int i=0; i<rowA; i++){
    for(int j=0; j<colA; j++){
        try {
            mA[i][j] = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter integer numbers only");
        }
    }

}
System.out.println("Please enter the values for matrix B");

//Loop through and stores the second matrix
for(int i=0; i<rowB; i++){
    for(int j=0; j<colB; j++){
        mB[i][j] = scanner.nextInt();
    }

}
    scanner.close();

        System.out.println("Matrix A");
        printMatrix(mA);
        System.out.println("Matrix B");
        printMatrix(mB);
        System.out.println("Matrix A X Matrix B");
        int[][] c = calculateMult(mA, mB);
        printMatrix(c);

    }
}
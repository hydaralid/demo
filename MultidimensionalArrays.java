import java.util.*;
public class MultidimensionalArrays {
    public static void main(String[] args) {

        // Multidimensional Arrays
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of 2 Matrices
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int col = sc.nextInt();

        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int sumMatrix[][] = new int[row][col];
        int mulMatrix[][] = new int[row][col];

        System.out.print("Enter Values for 1st Matrix: ");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1.length;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter Values for 2nd Matrix: ");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2.length;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // Sum of 2 Matrices
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2.length;j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.print("Sum of 2 Matrices is: ");
        System.out.println();
        for(int i=0;i<sumMatrix.length;i++){
            for(int j=0;j<sumMatrix.length;j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }


        // Multiplication of 2 Matrices

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2.length;j++){
                for(int k=0;k<mulMatrix.length;k++){
                    mulMatrix[i][j] = mulMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("Multiplication of 2 Matrices is: ");
        for(int i=0;i<mulMatrix.length;i++){
            for(int j=0;j<mulMatrix.length;j++){
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}

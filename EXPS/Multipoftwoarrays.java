package EXPS;
import java.util.Scanner;
public class Multipoftwoarrays {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of rows in first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        int cols1 = scanner.nextInt();

       
        System.out.print("Enter number of rows in second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int cols2 = scanner.nextInt();

        
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Number of columns in first matrix must equal number of rows in second matrix.");
            return;
        }

        
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] product = new int[rows1][cols2];

        
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                 
                matrix1[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                 
                matrix2[i][j] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

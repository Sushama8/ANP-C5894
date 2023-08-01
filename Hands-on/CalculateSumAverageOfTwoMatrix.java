/*
 Practise Example - Find the sum & average of 2 matix.
*/
package array;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateSumAverageOfTwoMatrix
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of columns for the matrices:");
        int coloumn = scanner.nextInt();

        int[][] matrix1 = new int[rows][coloumn];
        int[][] matrix2 = new int[rows][coloumn];

        System.out.println("Enter the elements of Matrix 1:");
        readMatrixElements(matrix1, scanner);
        
        System.out.println("Enter the elements of Matrix 2:");
        readMatrixElements(matrix2, scanner);

        scanner.close();

        if (!hasSameDimensions(matrix1, matrix2))
        {
            System.out.println("Matrices should have the same dimensions for addition.");
            return;
        }

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        double[][] avgMatrix = calculateAverage(sumMatrix, 2);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);

        System.out.println("Average Matrix:");
        printMatrix(avgMatrix);
    }

    public static boolean hasSameDimensions(int[][] matrix1, int[][] matrix2)
    {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static void readMatrixElements(int[][] matrix, Scanner scanner)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2)
    {
        int rows = matrix1.length;
        int coloumn = matrix1[0].length;

        int[][] result = new int[rows][coloumn];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < coloumn; j++)
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static double[][] calculateAverage(int[][] matrix, int divisor)
    {
        int rows = matrix.length;
        int coloumn = matrix[0].length;

        double[][] result = new double[rows][coloumn];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < coloumn; j++)
            {
                result[i][j] = (double) matrix[i][j] / divisor;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void printMatrix(double[][] matrix)
    {
        for (double[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
	        
		

	}

}

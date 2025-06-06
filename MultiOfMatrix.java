package first;


		public class MultiOfMatrix {

		    // Method to multiply two matrices
		    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
		        int rowsA = a.length;           // Number of rows in matrix A
		        int colsA = a[0].length;        // Number of columns in matrix A
		        int rowsB = b.length;           // Number of rows in matrix B
		        int colsB = b[0].length;        // Number of columns in matrix B
		        
		        // Matrix A's number of columns should equal Matrix B's number of rows
		        if (colsA != rowsB) {
		            throw new IllegalArgumentException("Matrix A's columns must match Matrix B's rows for multiplication.");
		        }

		        // Resultant matrix will have the number of rows of A and columns of B
		        int[][] result = new int[rowsA][colsB];

		        // Multiply the matrices
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                // For each element in the result matrix, compute the sum of the product of corresponding elements
		                for (int k = 0; k < colsA; k++) {
		                    result[i][j] += a[i][k] * b[k][j];
		                }
		            }
		        }

		        return result;
		    }

		    public static void main(String[] args) {
		        // Example matrices
		        int[][] a = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };
		        
		        int[][] b = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		        // Call the multiplyMatrices method
		        int[][] result = multiplyMatrices(a, b);

		        // Print the result matrix
		        System.out.println("Result of Matrix Multiplication:");
		        for (int i = 0; i < result.length; i++) {
		            for (int j = 0; j < result[i].length; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();  // Newline for each row
		        }
		    }
		}

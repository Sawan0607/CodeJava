package first;


//		public class TwoDArray { 
//		   
//		    public static void printMatrix(int[][] matrix) { 
//		        for (int[] row : matrix) { 
//		            for (int num : row) { 
//		                System.out.printf("%4d", num); 
//		            } 
//		            System.out.println(); 
//		        } 
//		    }
//		}

public class TwoDArray {

    // Print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Outer loop iterates through each row
            for (int num : row) { // Inner loop iterates through each number in the current row
                System.out.printf("%4d", num); // %4d formats each number to take up 4 spaces, for alignment
            }
            System.out.println(); // Move to the next line after printing all numbers in a row
        }
    }

    public static void main(String[] args) {
        // Example 1: A 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        // Expected Output:
        //    1   2   3
        //    4   5   6
        //    7   8   9

        System.out.println("\n---------------------\n"); // Separator for clarity

        // Example 2: A 2x4 matrix with different numbers
        int[][] matrix2 = {
            {10, 200, 30, 4},
            {500, 60, 7, 8000}
        };

        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        // Expected Output:
        //   10 200  30   4
        //  500  60   7 8000

        System.out.println("\n---------------------\n");

        // Example 3: A 1x5 matrix (single row vector)
        int[][] matrix3 = {
            {100, 200, 300, 400, 500}
        };

        System.out.println("Matrix 3 (Single Row):");
        printMatrix(matrix3);
        // Expected Output:
        //  100 200 300 400 500

        System.out.println("\n---------------------\n");

        // Example 4: A 4x1 matrix (single column vector)
        int[][] matrix4 = {
            {10},
            {20},
            {30},
            {40}
        };

        System.out.println("Matrix 4 (Single Column):");
        printMatrix(matrix4);
        // Expected Output:
        //   10
        //   20
        //   30
        //   40
    }
}
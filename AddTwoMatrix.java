package first;

		public class AddTwoMatrix {

		    // Function to add two matrices
		    public static int[][] addMatrices(int[][] a, int[][] b) {
		        // Get the number of rows in matrix a
		        int rows = a.length;
		        
		        // Get the number of columns in matrix a (assuming both matrices have the same dimensions)
		        int cols = a[0].length;
		        
		        // Initialize a result matrix with the same dimensions as a and b
		        int[][] result = new int[rows][cols];
		        
		        // Loop through each element of the matrices
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                // Add the corresponding elements from a and b and store in result
		                result[i][j] = a[i][j] + b[i][j];
		            }
		        }
		        
		        // Return the resulting matrix
		        return result;
		    }

		    // Main method to test matrix addition
		    public static void main(String[] args) {
		        // Define two matrices a and b
		        int[][] a = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        
		        int[][] b = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };
		        
		        // Call the addMatrices function to add a and b
		        int[][] sum = addMatrices(a, b);
		        
		        // Print the resulting matrix
		        System.out.println("Sum of matrices:");
		        for (int i = 0; i < sum.length; i++) {
		            for (int j = 0; j < sum[i].length; j++) {
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();  // Newline for each row
		        }
		    }
		}



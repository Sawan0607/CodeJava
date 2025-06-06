package first;



	
	import java.util.Arrays; 

	public class BubbleSort {
	    public static void bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) { 
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j]; 
	                    arr[j] = arr[j + 1]; 
	                    arr[j + 1] = temp; 
	                } 
	            } 
	        } 
	    } 

	    public static void main(String[] args) {
	        int[] myArray = {64, 34, 25, 12}; 
	        System.out.println("Original: " + Arrays.toString(myArray));
	        bubbleSort(myArray);
	        System.out.println("Sorted: " + Arrays.toString(myArray));
	    }
	}
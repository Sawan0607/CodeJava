package first;

public class ArrayNoFound {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int search = 7;
		
		
		int left = 0;
		
		int right = arr.length-1;
		
		boolean found = false;
		
		while(left<=right) {
			
			int mid = (left + right) /2;
			
			if(arr[mid] == search) {
				System.out.println("No Found "  + arr[mid]);
				found = true;
				break;
			}
			
			if(search > arr[mid]) {
				left = mid + 1;
			}
			else {
				right = mid-1; 
			}
			
			
			
		}
		
		if (!found) { 
			System.out.println("Number " + search + " not found in the array.");
		}
	}

}

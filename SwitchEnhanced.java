package first;

	public class SwitchEnhanced {
	    public static void main(String[] args) {
	        String month = "February"; 
	        
	        int daysInMonth = switch (month) {
	            case "January", "March", "May", "July", "August", "October", "December" -> 31;  
	            case "April", "June", "September", "November" -> 30;                          
	            case "February" -> 28;                                                       
	            default -> {
	                System.out.println("Invalid month name. Please enter a valid month.");
	                yield -1;  
	            }
	        };

	        if (daysInMonth != -1) {
	            System.out.println(month + " has " + daysInMonth + " days.");
	        }
	    }
	}

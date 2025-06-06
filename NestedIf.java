package first;

public class NestedIf {
    public static void main(String[] args) {
        int age = 20;  
        boolean hasLicense = true;  

        if (age >= 18) { 
            if (hasLicense) {  
                System.out.println("You can drive.");
            } else {
                System.out.println("You cannot drive because you don't have a license.");
            }
        } else {
            System.out.println("You cannot drive because you are under 18.");
        }
    }
}

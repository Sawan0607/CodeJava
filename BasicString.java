package first;

public class BasicString {
    public static void main(String[] args) {
    	String str1 = "Hello";
    	String str2 = "World";
    	
    	String result = str1 + " " + str2;
    	System.out.println("concatenation :" + result);
    	
    	
    	System.out.println("length of str1 :" + str1.length());
    	
    	
    	System.out.println("Char at index 1 in  str1 :" + str1.charAt(1));
    	
    	System.out.println("Substring of str2 from index 1 :" + str2.substring(1));
    	
    	System.out.println("str1 equal 'hello' :" + str1.equals("Hello"));
    	
    	System.out.println("str1 equal ignore case 'Hello':" + str1.equalsIgnoreCase("Hello"));
    	
    	
    	System.out.println("index of 'e' in str1 :" + str1.indexOf('e'));
    	
    	System.out.println("contains of 'orl' in str2 :" + str2.contains("orl"));
    	
    	System.out.println("Uppercase str1  :" + str1.toUpperCase());
    	
    	System.out.println("Lowercase str2  :" + str2.toLowerCase());
    	
    	String str3 = "   Trim me   "; 
        System.out.println("Trimmed: '" + str3.trim() + "'");
        
        System.out.println("Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	



}
}
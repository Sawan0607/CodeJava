package first;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
		
		int age = 35;
		boolean hl = true;
		
		System.out.println(age > 21);
		System.out.println(age <= 30);
		System.out.println(age == 25);
		System.out.println(age != 30);
		System.out.println(age >= 16 && hl);
		System.out.println(age >= 13 && age <= 19 || age >= 65);
		System.out.println(!(age>=18));
		
		boolean result = (5>3) || (10/0 == 0);
		System.out.println(result);


	}

}

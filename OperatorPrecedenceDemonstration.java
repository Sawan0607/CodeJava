package first;

public class OperatorPrecedenceDemonstration {

	public static void main(String[] args) {
		
		int r1 = 5 + 3 * 2;
		int r2 = (5+3)*2;
		boolean r3 = 5 > 3 && 2 < 4 || 1 == 0;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		//CE
		
		int a = 2 , b = 3 , c = 4;
		int CR = a++ * --b + c / a;
		System.out.println(CR);


	}

}

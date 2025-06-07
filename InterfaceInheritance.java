package first;


		interface ccc { 
		    void eat(); 
		} 
		 
		interface Bird { 
		    void fly(); 
		} 
		 
		class Parrot implements ccc, Bird { 
		    @Override 
		    public void eat() { 
		        System.out.println("Parrot eats fruits"); 
		    } 
		     
		    @Override 
		    public void fly() { 
		        System.out.println("Parrot can fly"); 
		    } 
		     
		    void speak() { 
		        System.out.println("Parrot can mimic human speech"); 
		    } 
		} 
		 
		public class InterfaceInheritance { 
		    public static void main(String[] args) { 
		        Parrot p = new Parrot(); 
		        p.eat(); 
		p.fly(); 
		p.speak(); 
		} 
		}

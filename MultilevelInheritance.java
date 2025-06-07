package first;


		class Grandparent { 
		    void grandparentMethod() { 
		        System.out.println("Grandparent's method"); 
		    } 
		} 
		 
		class Parent extends Grandparent { 
		    void parentMethod() { 
		        System.out.println("Parent's method"); 
		    } 
		} 
		 
		class Child extends Parent { 
		    void childMethod() { 
		        System.out.println("Child's method"); 
		    } 
		} 
		 
		public class MultilevelInheritance { 
		    public static void main(String[] args) { 
		        Child obj = new Child(); 
		        obj.grandparentMethod(); 
		        obj.parentMethod(); 
		        obj.childMethod(); 
		    } 
		} 
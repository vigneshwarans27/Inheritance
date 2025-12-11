package Inheritance;

	class animals{
		void sound() {
			System.out.println("Animals make sound");
		}
	}
	
	class dogs extends animals{
		void barks() {
			System.out.println("Dog barks");
		}
	}
	
	class cats extends animals{
		void meow() {
			System.out.println("cat meow");
		}
	}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		dogs d = new dogs();
		cats c = new cats();
		
		d.sound();
		d.barks();
		c.meow();

	}

}

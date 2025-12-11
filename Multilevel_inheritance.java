package Inheritance;

	class lion{
		void sound() {
			System.out.println("Lion roars");
		}
	}
	
	class cheetha extends lion{
		void run() {
			System.out.println("Cheetha runs fast");
		}
	}
	
	class puppy extends cheetha{
		void cry() {
			System.out.println("Puppy cry");
		}
	}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		puppy p = new puppy();
		
		p.sound();
		p.run();
		p.cry();

	}

}

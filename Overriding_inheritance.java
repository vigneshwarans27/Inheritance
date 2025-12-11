package Inheritance;

	class aanimal{
		void sound() {
			System.out.println("animal makes a sound");
		}
	}
	
	class ddog extends aanimal{
		void sound() {
			System.out.println("dog barks");
		}
	}

public class Overriding_inheritance {

	public static void main(String[] args) {
		aanimal obj = new ddog();
		obj.sound();

	}

}

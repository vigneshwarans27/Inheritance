package Inheritance;

	class animal{
		void eat() {
			System.out.println("Animal is eating");
		}
	}
	
	class dog extends animal{
		void bark () {
			System.out.println("dog is barking");
		}
	}

public class Single_inheritance {

	public static void main(String[] args) {
		dog d = new dog();
		
		d.eat();
		d.bark();

	}

}

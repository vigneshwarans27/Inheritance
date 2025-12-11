package Inheritance;

	class aniimal{
		aniimal(){
			System.out.println("animal constructor");
		}
		
		void eat() {
			System.out.println("animal eats");
		}
	}
	
	class doog extends aniimal{
		doog(){
			super();
			System.out.println("dog constructor");
		}
		
		void eat() {
			super.eat();
			System.out.println("dog eats biscuits");
		}
	}

public class Super_inheritance {

	public static void main(String[] args) {
		doog d = new doog();
		
		d.eat();
		}

	}



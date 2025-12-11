package Inheritance;

	interface animall{
		void eat();
	}
	
	interface pet{
		void play();
	}
	
	class dogg implements animall,pet{
		public void eat() {
			System.out.println("dog eats bones");
		}
		
		public void play() {
			System.out.println("dog plays with ball");
		}
	}

public class Multiple_inheritance {

	public static void main(String[] args) {
		dogg d = new dogg();
		
		d.eat();
		d.play();

	}

}

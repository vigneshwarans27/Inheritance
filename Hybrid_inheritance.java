package Inheritance;

	interface annimal{
		void eat();
	}
	
	interface pets{
		void play();
	}
	
	class dogss implements annimal,pets{
		public void eat() {
			System.out.println("dog eats biscuits");
		}
		
		public void play() {
			System.out.println("dog plays fetch");
		}
	}
	
	class puppys extends dogss{
		void weep() {
			System.out.println("puppy is weeping");
		}
	}

public class Hybrid_inheritance {

	public static void main(String[] args) {
		puppys p = new puppys();
		
		p.eat();
		p.play();
		p.weep();

	}

}

class Mammal {
	public Mammal(int age) {
		System.out.print("Mammal");
	}
}

public class Platypus extends Mammal {
	public Platypus() {
		super(5);
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5); // output: Mammal
		System.out.println();
		new Platypus(); // output: MammalPlatypus
	}
}
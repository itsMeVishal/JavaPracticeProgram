
public class BoxingDemo {

	public static void main(String[] args) {

		BoxingDemo bd = new BoxingDemo();
		bd.display(10);
	}

	public void display(double i) {

		System.out.println("Wrapper value:" + i);
	}

	public void display(int i) {
		System.out.println("normal value" + i);
	}

}

package principleOfOOP;

public class PenDriver {
	public static void main(String[] args) {
		Pen p1 = new Pen("Reynolds", "Black", "Gel Pen", 20, "Reynolds", "Black", "Gel Ink", 5);
		p1.displayPen();
		p1.ref.displayRefill();
	}

}

package principleOfOOP;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Motorola", "Edge 20 Fusion", 18999.00, "5g", "Android");
		m1.displayMobile();
		m1.insertSim("VI", "4g", 9876543210l, "Postpaid");
		m1.s1.displaySim();
	}
	
}

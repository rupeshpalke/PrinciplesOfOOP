package principleOfOOP;

public class Refill {
	String brand;
	String color;
	String refillType;
	double price;
	
	Refill(){}

	Refill(String brand, String refillType, double price, String color) {
		this.brand = brand;
		this.refillType = refillType;
		this.price = price;
		this.color = color;
	}
	public void displayRefill()
	{
		System.out.println("Brand "+brand);
		System.out.println("Refill Type "+refillType);
		System.out.println("Price "+price);
		System.out.println("Color "+color);
	}
}
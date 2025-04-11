package principleOfOOP;

public class Pen {
	String penBrand;
	String penColor;
	String penType;
	double penPrice;
	Refill ref;
	
	Pen(){
		
	}
	Pen(String penBrand, String penColor, String penType, double penPrice, String brand, String color, String refillType, double price){
		ref = new Refill(brand, refillType, price, color);
		this.penBrand = penBrand;
		this.penColor = penColor;
		this.penType = penType;
		this.penPrice = penPrice;
	}
	
	public void displayPen()
	{
		System.out.println(penBrand);
		System.out.println(penColor);
		System.out.println(penType);
		System.out.println(penPrice);
	}

}

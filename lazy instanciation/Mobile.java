package principleOfOOP;

public class Mobile {
	String brand;
	String model;
	double price;
	String type;
	String osType;
	Sim s1;
	
	Mobile(){}

	Mobile(String brand, String model, double price, String type, String osType) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.type = type;
		this.osType = osType;
	}
	public void insertSim(String serviceProvider, String networkType, long simNo, String type) 
	{
		//Helper method
		s1 = new Sim(serviceProvider, networkType, simNo, type);
		System.out.println("Sim Inserted");
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(type);
		System.out.println(osType);
	}
	
	
}

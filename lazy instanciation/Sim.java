package principleOfOOP;

public class Sim {
	String serviceProvider;
	String networkType;
	long simNo;
	String type;
	
	Sim(){}

	Sim(String serviceProvider, String networkType, long simNo, String type) {
		this.serviceProvider = serviceProvider;
		this.networkType = networkType;
		this.simNo = simNo;
		this.type = type;
	}
	public void displaySim()
	{
		System.out.println(serviceProvider);
		System.out.println(networkType);
		System.out.println(simNo);
		System.out.println(type);
	}
	
}

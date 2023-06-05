// Chapter 3 Exercise - 05.11.23, Teri T
public class SpaService
{
	// instance variables for this class
	private String serviceDescription;
	private double price;

	// New constructor method for this SpaService class
	public SpaService()
	{
		serviceDescription = "Basic Service";
		price = 15.99;
	}

	// definition of the setServiceDescription() method
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}	// end of setService Description()

	// defintion of the setPrice() method
	public void setPrice(double servicePrice)
	{
		price = servicePrice;
	}	// end of setPrice()

	//definition of the getServiceDescription() method
	public String getServiceDescription()
	{
		return serviceDescription;
	}	// end of getServiceDescription()

	// definition of the getPrice() method
	public double getPrice()
	{
		return price;
	}	// end of getPrice()

}	// end of class SpaService
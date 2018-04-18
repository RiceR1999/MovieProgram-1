
public class Seat 
{

	public Seat() 
	{
		// TODO Auto-generated constructor stub
	}
boolean taken;
Customer theCustomer;
	
	/*
	* Method that checks if a seat is taken.
	*/
	public boolean isTaken()
	{
		return taken;
	}
	/*
	* Method that adds cutomer to a seat.
	*/
	public void addCustomer(Customer c)
	{
		theCustomer = c;
	}
	/*
	* Method that gets customer info.
	*/
	public void getCustomerInfo(Customer c)
	{
		theCustomer.getName();
		theCustomer.getNumber();
	}
}

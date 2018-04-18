/**
 * Class that defines a Seat object, Can add customers and show if a seat is taken.
 * @version 4.18.2018
 * @author 
 */
public class Seat 
{
  private boolean taken;
  private Customer theCustomer;
        /**
	* Constructor for seat class
	*/
	public Seat() 
	{
		// TODO Auto-generated constructor stub
	}

	
	/**
	* Method that checks if a seat is taken.
	* @return taken
	*/
	public boolean isTaken()
	{
		return taken;
	}
	/**
	* Method that adds cutomer to a seat.
	*@param Customer
	*/
	public void addCustomer(Customer c)
	{
		theCustomer = c;
		taken = true;
	}
	/**
	* Method that gets customer info.
	*@param Customer
	*/
	public void getCustomerInfo(Customer c)
	{
		theCustomer.getName();
		theCustomer.getNumber();
	}
}

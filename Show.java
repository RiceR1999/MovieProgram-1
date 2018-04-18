/**
* Class that defines a show object
* @version 4.18.2018
* @author Nick Digi
*/
public class Show 
{
	int time;
	
	int day;
	int month;
	int year;
	
	String showName;
	int capacity ;

	//One ArrayList for each Row.
	ArrayList<Seat> RowA= new ArrayList<Seat>();
	ArrayList<Seat> RowB= new ArrayList<Seat>();
	
	/**
	* Constructor for Show class
	* @param time
	* @param day
	* @param month
	* @param year
	* @param showName
	* @param capacity
	*/
	public Show(int time,int day,int month,int year,int showName,int capacity) 
	{
		// TODO Auto-generated constructor stub
	}

/**
* Method that fills Row ArrayLists with seat objects.
* @param given
*/
public void fillRow(ArrayList given)
{
	
}

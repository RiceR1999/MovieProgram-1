import java.util.*;
/**
* Class that defines a theater object
* @version 4.18.2018
* @author
*/
public class Theater 
{
 
  private String theaterName;
  private String location;
  private int ID;
  private ArrayList<Show> shows= new ArrayList<Show>();
	
	/**
	* Constructor for theater class
	* @param theaterName
	*/
	public Theater(String theTheaterName,String theLocation,int theID) 
	{
		theaterName = theTheaterName;
		location = theLocation;
		ID = theID;
	}
	
	/**
	* Accessor method that gets theater name
	* @return theaterName
	*/
	public String getTheaterName(){
		return theaterName;
	}
	
	/**
	* Method that adds a show to shows array
	* @param show
	*/
	public void addShow(Show show){
		shows.add(show);
	}
	
	/**
	* Print method that prints theater name and all the shows and show times at said instance
	*/
	public void printTheaterDetails(){
		System.out.println(theaterName + ": Located in " + location);
		System.out.println("ID Number: " + ID);
		System.out.println("========================================");
	}
	
	public void printSeatDetails(int index){
		Show show1;
			show1 = shows.get(index-1);
			show1.getRowSeats();
			System.out.println("========================================");
	}
	
	public void reserveSeat(int index,String theRow, String theSeat,Long theNumber){
		Show show1;
			show1 = shows.get(index-1);
			show1.reserveASeat(theRow,theSeat,theNumber);
			System.out.println("Your seat " + theRow + theSeat + " has been reserved under the phone numner "+ theNumber );
	}
	
	public void printShows(){
		int index = 0;
		Show show1;
		while(index<shows.size())
		{
			show1 = shows.get(index);
			show1.getInfo();
			System.out.println("========================================");
			index++;
		}
	}

}

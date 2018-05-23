import java.util.*;
/**
* Class that defines a show object
* @version 4.18.2018
* @author Tavis Baylor, Zach Ventola, Ryan Rice, Zain Shahabuddin, Nick DiGiovanni
*/
public class Show 
{
	String time;
	
	int day;
	int month;
	int year;
	int ID;
	String showName;
	//int capacity ;

	//One ArrayList for each Row.
	ArrayList<Long> RowA= new ArrayList<Long>();
	ArrayList<Long> RowB= new ArrayList<Long>();
	ArrayList<Long> RowC= new ArrayList<Long>();
	ArrayList<Long> RowD= new ArrayList<Long>();
	
	
	/**
	* Constructor for Show class
	* @param time
	* @param day
	* @param month
	* @param year
	* @param showName
	* @param capacity
	*/
	public Show(String thetime,int theday,int themonth,int theyear,String theshowName,int theID) 
	{
		time = thetime;
		year = theyear;
		day= theday;
		month = themonth;
		year = theyear;
		showName = theshowName;
		ID = theID;
		fillRow(RowA);
		fillRow(RowB);
		fillRow(RowC);
		fillRow(RowD);
	}

/**
* Method that fills Row ArrayLists with seat objects.
* @param given
*/
public void fillRow(ArrayList<Long> given)
{
	int index = 0;
	while(index<10)
	{
		given.add(new Long(0));
		index++;
	}
}
/**
* Method that prints time, date, and show name to user.
*/
public void getRowSeats()
{
	int index = 0;
	System.out.print("ROW A: ");
	while(index<10)
	{
		if(RowA.get(index)==0)
		{
			System.out.print("[Seat  " + (index+1)+"]");
		}
		else
		{
			System.out.print("[TAKEN " + (index+1)+"]");
		}
		index++;
	}
	System.out.println("");
	System.out.print("ROW B: ");
	index = 0;
	while(index<10)
	{
		if(RowB.get(index)==0)
		{
			System.out.print("[Seat  " + (index+1)+"]");
		}
		else
		{
			System.out.print("[TAKEN " + (index+1)+"]");
		}
		index++;
	}
	System.out.println("");
	System.out.print("ROW C: ");
	index = 0;
	while(index<10)
	{
		if(RowC.get(index)==0)
		{
			System.out.print("[Seat  " + (index+1)+"]");
		}
		else
		{
			System.out.print("[TAKEN " + (index+1)+"]");
		}
		index++;
	}
	System.out.println("");
	System.out.print("ROW D: ");
	index = 0;
	while(index<10)
	{
		if(RowD.get(index)==0)
		{
			System.out.print("[Seat  " + (index+1)+"]");
		}
		else
		{
			System.out.print("[TAKEN " + (index+1)+"]");
		}
		index++;
	}
	System.out.println("");
}
public void getInfo()
{
	System.out.println(showName + ": Playing on " + day + "/" + month + "/" + year + ": At "+ time);
	System.out.println("ID Number: " + ID);
}
public void reserveASeat(String theRow, String theSeat, Long number)
{
	int seatChoice = Integer.parseInt(theSeat)-1;
	if(theRow.equals("A"))
	{
		RowA.set(seatChoice, number);
	}
	if(theRow.equals("B"))
	{
		RowB.set(seatChoice, number);
	}
	if(theRow.equals("C"))
	{
		RowC.set(seatChoice, number);
	}
	if(theRow.equals("D"))
	{
		RowD.set(seatChoice, number);
	}
}

}

 /**
 * Class that contains the start method.
-* @version 4.18.2018
+* @version 4.29.2018
 * @author Tavis Baylor, Zach Ventola, Ryan Rice, Zain Shahabuddin, Nick DiGiovanni
 */
 import java.util.Scanner;
 public class CinemaBookingSystem 
 {
 	Theater theater1 = new Theater("Broadway Theatre", "PitMan NJ",247);
 	Theater theater2 = new Theater("AMC Classic", "Auburn NJ",864);
-	Show show1 = new Show("1:00PM",7,8,2018,"Mulan",101);
+	Theater theater3 = new Theater("Starpass", "Jackson NJ",451);
+	Theater theater4 = new Theater("Xscape", "Howell NJ",157);
+	
+	Show show1 = new Show("1:00PM",5,5,2018,"Mulan",101);
+	Show show2 = new Show("2:00PM",5,5,2018,"Ready Player One",102);
+	Show show3 = new Show("5:00PM",5,5,2018,"Rampage",103);
+	Show show4 = new Show("6:00PM",5,5,2018,"Avengers",104);
+	Show show5 = new Show("1:00PM",5,5,2018,"Black Panther",105);
+	Show show6 = new Show("3:00PM",5,5,2018,"Peter Rabbit",106);
+	Show show7 = new Show("7:00PM",5,5,2018,"Game Night",107);
+	Show show8 = new Show("8:00PM",5,5,2018,"Kings",108);
 	int theaterNum = 0;
 	
 	public CinemaBookingSystem() 
 	{
 		theater1.addShow(show1);
+		theater1.addShow(show2);
+		theater1.addShow(show3);
+		theater1.addShow(show4);
+		
+		theater2.addShow(show5);
+		theater2.addShow(show6);
+		theater2.addShow(show7);
+		theater2.addShow(show8);
+		
+		theater3.addShow(show5);
+		theater3.addShow(show6);
+		theater3.addShow(show7);
+		theater3.addShow(show8);
+		
+		theater4.addShow(show1);
+		theater4.addShow(show2);
+		theater4.addShow(show3);
+		theater4.addShow(show4);
 	}
 	/*
 	* Method responsible for displaying Theaters, Shows, and taking user input.
@@ -27,17 +55,19 @@ public void start()
     	System.out.println("========================================");
     	theater1.printTheaterDetails();
     	theater2.printTheaterDetails();
+    	theater3.printTheaterDetails();
+    	theater4.printTheaterDetails();
     	System.out.println("Enter the ID of the theater you want to book:");
     	int firstScan = scan.nextInt();
     	System.out.println("Here are the shows avalable:");
     	System.out.println("========================================");
     	
-    	if(firstScan==247)
+    	if(firstScan==247 || firstScan==157)
     	{
     		theater1.printShows();
     		theaterNum=1;
     	}
-    	if(firstScan==864)
+    	if(firstScan==864 || firstScan==451)
     	{
     		theater2.printShows();
     		theaterNum=2;
@@ -56,10 +86,51 @@ public void start()
     		System.out.println("Here are the seats avalable:");
     	    System.out.println("========================================");	
     	    theater1.printSeatDetails(1);
+    		}
+    		if(secondScan==102)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(2);
+    		}
+    		if(secondScan==103)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(3);
+    		}
+    		if(secondScan==104)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(4);
     		}
     		break;
     	case 2:
-    		
+    		if(secondScan==105)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(1);
+    		}
+    		if(secondScan==106)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(2);
+    		}
+    		if(secondScan==107)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(3);
+    		}
+    		if(secondScan==108)
+    		{
+    		System.out.println("Here are the seats avalable:");
+    	    System.out.println("========================================");	
+    	    theater1.printSeatDetails(4);
+    		}
     		break;
     	}
     	
@@ -75,9 +146,36 @@ public void start()
     		{
     		theater1.reserveSeat(1,rowChoice,seatChoice,thirdScan);
     		}
+    		if(secondScan==102)
+    		{
+    		theater1.reserveSeat(2,rowChoice,seatChoice,thirdScan);
+    		}
+    		if(secondScan==103)
+    		{
+    		theater1.reserveSeat(3,rowChoice,seatChoice,thirdScan);
+    		}
+    		if(secondScan==104)
+    		{
+    		theater1.reserveSeat(4,rowChoice,seatChoice,thirdScan);
+    		}
     		break;
     	case 2:
-    		
+    		if(secondScan==105)
+    		{
+    		theater1.reserveSeat(1,rowChoice,seatChoice,thirdScan);
+    		}
+    		if(secondScan==106)
+    		{
+    		theater1.reserveSeat(2,rowChoice,seatChoice,thirdScan);
+    		}
+    		if(secondScan==107)
+    		{
+    		theater1.reserveSeat(3,rowChoice,seatChoice,thirdScan);
+    		}
+    		if(secondScan==108)
+    		{
+    		theater1.reserveSeat(4,rowChoice,seatChoice,thirdScan);
+    		}
     		break;
     	}
     	
@@ -96,3 +194,4 @@ public void start()
     scan.close();
 	//display shows
 	}
+}

//Jessica Hadwiger Program 3 6/26/17
import java.util.Scanner;
public class MPGMain 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);	
		Mileage mileage = new Mileage();
		Distance dist = new Distance();
		Speed rate = new Speed();
		
		//variables
		double miles, gallons, distance, speed, time;
		int ID;
		
		//Menu
		System.out.println("Enter 1 to Determine Miles-per-Gallon");
		System.out.println("Enter 2 to Determine Distance");
		System.out.println("Enter 3 to Determine Miles-per-Hour");
		System.out.println("Enter 4 to Exit");
		ID = keyboard.nextInt();
		
		while (ID != 4)
		{
			if (ID >=1 && ID < 4)
			{
				switch(ID)
				{
				case 1: // Mileage (MPG) information
					System.out.println("How many miles were driven? ");
					miles = keyboard.nextDouble();
					mileage.setMiles (miles);
					System.out.println("How many gallons were used? ");
					gallons = keyboard.nextDouble();
					mileage.setGallons (gallons); 
					System.out.printf("Your MPG is: %.2f", mileage.getMPG ());
					break;
				case 2: //Distance (R*T) Information
					System.out.println("What was the speed? ");
					speed = keyboard.nextDouble();
					dist.setSpeed(speed);
					System.out.println("What was the time traveled in hours? ");
					time = keyboard.nextDouble();
					dist.setTime(time);
					System.out.printf("Your distance traveled is: %.2f", dist.getDistance());
					break;
				case 3: //Speed (MPH) Information
					System.out.println("What was the distance traveled? ");
					distance = keyboard.nextDouble();
					rate.setDistance(distance);
					System.out.println("What was the time traveled in hours? ");
					time = keyboard.nextDouble();
					rate.setTime(time);
					System.out.printf("Your MPH is: %.2f", rate.getMPH());
					break;
				}//end of switch
			}//end of of if
			else
			{
				System.out.println("The value entered is not a correct entry.");
				System.out.println("Please enter a value between 1-3 or enter 4 to exit. ");
				System.out.println("Enter 1 to Determine Miles-per-Gallon");
				System.out.println("Enter 2 to Determine Distance");
				System.out.println("Enter 3 to Determine Miles-per-Hour");
				System.out.println("Enter 4 to Exit");
				ID = keyboard.nextInt();	
			}//end of else
		}//end of while
	}//end of main
}//end of MPGMain

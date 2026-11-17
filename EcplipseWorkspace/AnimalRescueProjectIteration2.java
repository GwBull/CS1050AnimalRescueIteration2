
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//imports all needed to read and write from a file 
// this will be used later
import java.util.Scanner;
// import scanner for testing without using a file

/*
 * Name: [George Bull]
 * Class: CS1050
 * Description: Animal Rescue Center Analysis - Iteration 02
 */

public class AnimalRescueProjectIteration2
{

	// start of main 
	public static void main(String[] args)
	{
		System.out.println("THIS IS A TEST");
		

	}
	// end of main 
	
// start of animal class 
	class Animal
// create the animal class which make an animal data type 
	{
	
		private String Name;
		
		private String Species;
		
		private double Weight;

		private double dailyFoodAmount;
		
		//create all the attributes of a an animal, they have a name a species a weight and a daily food amount
		
		public  Animal(String Name, String Species, double Weight, Double dailyFoodAmount)
		
		{
		
			this.Name = Name;
			
			this.Species = Species;
			
			this.Weight = Weight;
			
			this.dailyFoodAmount = dailyFoodAmount;
			
			/*
			 * This constructor creates a new Animal object and sets its starting values.
			 * It runs automatically whenever you write "new Animal(...)".
			 *
			 * Each parameter is equal to the  field of the object.
			 * "this." means "this object's field", which is how Java tells the
			 * this.Name = Name;   // toms Name becomes "tom"
			 * 
			 * Example:
			 *   Animal tom = new Animal("tom", "tiger", 197.5, 7.0);
			 * This makes an Animal named tom, a tiger that weighs 197.5
			 * and eats 7.0 units of food per day.
			 */
		}
		
		public String getName(){
			
			return this.Name;
		}
		// end of the get name method 
		
		public double getWeight(){
			
			return this.Weight;
		}
		// end of the get Weight method 
		
		public String getSepcies(){
			
			return this.Species;
		}
		// end of the get Species method 
		
		public double getdailyFoodAmount(){
			
			return this.dailyFoodAmount;
		}
		// end of the get name method 
	
		
	
	}
	

	// end of the animal class 
	
	class Rescue 
	
	{
	
		private String RescueName;
		
		private double AnimalCount;
		
		private double MaxAnimals;
	
	
		
	}
	// end of the rescue class 
}
// end of the file 

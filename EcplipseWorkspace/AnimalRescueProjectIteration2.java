
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

		System.out.println("**********************************************");
		System.out.println("Aniumal Rescue Center Analysis - Iteration 02");
		System.out.println("**********************************************");
		

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

		//START CALUALTE WEWEEKLY FOOD AMOUNT METHOD
		public double calculateweeklyFoodAmount()
		{
			double weeklyFoodAmount = this.dailyFoodAmount * 7;

			return weeklyFoodAmount;
			
		}
		//END CALCULATE WEEKLY FOOD AMOUNT METHOD

		public String determineWeightCategory()
		{
			String weightcategory = "";
			//creates the string weight catergory and sets it to an empty string
			if (this.Weight < 10)
			{
				weightcategory = "Small";
			}
			else if (this.Weight >= 10 && this.Weight < 50)
			{
				weightcategory = "Medium";
			}
			else
			{
				weightcategory = "Large";
			}

			return weightcategory;
		}

	
	
	}
	
	// end of the animal class 
	
	//start of the rescue class
	class Rescue 
	
	{
	
		private String RescueName;
		
		private double AnimalCount;
		
		private Animal[] Animals;
		
		/*
		 * Create a new class called rescue thats a data type called Rescue
		 * the attributes of this class are the name of the rescue 
		 * the current amount of animals that will be used for the size of the array 
		 * an array that hold animals using the animal data type and the length of the array is based on the current animals 
		 */
		
		public  Rescue(String RescueName, String Species, Animal[]Animals)
		
		{
		
			this.RescueName = RescueName;
			
			this.AnimalCount = AnimalCount;
			
			this.Animals = new Animal[(int) AnimalCount];
			
			
		}
		//end of the constructor for the rescue class
		//this will create a new rescue object and set the starting values for the rescue name, animal count and the array of animals in the rescue

		public String getRescueName(){
			
			return this.RescueName;
		}
		// create get rescue name method to return the name of the rescue

		public double getAnimalCount(){
			
			return this.AnimalCount;
		}
		// create get animal count method to return the current amount of animals in the rescue

		public Animal[] getAnimals(){
			
			return this.Animals;
		}
		// create get animals method to return the array of animals in the rescue
	
		
	}
	// end of the rescue class 

	//start the user story methods
	//start the get weekly food amount method
	
}
// end of the file 

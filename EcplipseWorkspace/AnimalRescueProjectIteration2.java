
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

		Animal luna  = new Animal("Luna", "Dog", 20.0, 1.50);
		Animal pip   = new Animal("Pip", "Bird", 0.8, 0.10);
		Animal rex   = new Animal("Rex", "Dog", 100.0, 3.00);
		Animal bella = new Animal("Bella", "Cat", 8.0, 0.60);

		// create an dhardcode 4 animlas to test the class and the program


		System.out.println("**********************************************");
		System.out.println("Aniumal Rescue Center Analysis - Iteration 02");
		System.out.println("**********************************************");
		System.out.println("Reads Animal information from a file");
		System.out.println("Calculates average dailyand total weekly food");
		System.out.println("writes rescue infromation and anylsis to a file");
		
	}

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
		public double calculateWeeklyFood()
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

		public void displayAnimalAnylasis()
		{
			System.out.println("Animal Name: " + this.Name);
			// displays the name of the animal
			System.out.println("Species: " + this.Species);
			// displays the species of the animal
			System.out.println("Weight: " + this.Weight);
			// displays the weight of the animal
			System.out.println("Daily Food Amount: " + this.dailyFoodAmount);
			// displays the daily food amount of the animal
			System.out.println("Weekly Food Amount: " + this.calculateWeeklyFood());
			// displays the weekly food amount of the animal
			System.out.println("Weight Category: " + this.determineWeightCategory());
			// displays the weight category of the animal
		}
	
	
	}
	
	// end of the animal class 
	
	//start of the rescue class
	class Rescue 
	
	{
	
		private String RescueName;
		// create the attribute oof a rescue which is the name of the rescue
		private double AnimalCount;
		// create the attribute of a rescue which is the current amount of animals in the rescue
		private Animal[] Animals;
		// create the attribute of a rescue which is an array of animals in the rescue

		/*
		 * Create a new class called rescue thats a data type called Rescue
		 * the attributes of this class are the name of the rescue 
		 * the current amount of animals that will be used for the size of the array 
		 * an array that hold animals using the animal data type and the length of the array is based on the current animals 
		 */
		
		public  Rescue(String RescueName, double AnimalCount, Animal[]Animals)
		
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

		public void addAnimal()
		{
			if (AnimalCount < Animals.length)
			{
				System.out.println("Animal added to the rescue");
			}
			else
			{
				System.out.println("Resizing array and adding animal to the rescue");
			}


		}
		// end of the add animal method, this verifys that theere is room within the array or shrelter

		/** 
		 * displays the recues infromation 
		 **/

		public void displayRescueAnylasis()
		{
			System.out.println("Rescue Name: " + this.RescueName);
			// displays the name of the rescue
			System.out.println("Animal Count: " + this.AnimalCount);
			// displays the current amount of animals in the rescue
			
		}
		//end of the daily rescue method 
		//start the calculate total weekly food method
		public double calculateTotalWeeklyFood()
		{
			double totalWeeklyFood = 0.0;
			// creates a variable to hold the total weekly food amount for all animals in the rescue
			for (int i = 0; i < AnimalCount; i++)
			{
				totalWeeklyFood = totalWeeklyFood + Animals[i].calculateWeeklyFood();
			}
			// use a for loop to iterate through the array of animals in the rescue and add the weekly food amount for each animal to the total weekly food amount
			// use the array of animasl and the .calculateWeeklyFood() method to get the weekly food amount for each animal in the array
			return totalWeeklyFood;
			//return the total weekly food amount for all animals in the rescue
		}

		public double calculateAverageDailyFood()
		{
			double totalDailyFood = 0.0;
			// creates a variable to hold the total daily food amount for all animals in the rescue
			for (int i = 0; i < AnimalCount; i++)
			{
				totalDailyFood = totalDailyFood + Animals[i].getdailyFoodAmount();
			}
			// use a for loop to iterate through the array of animals in the rescue and add the daily food amount for each animal to the total daily food amount
			// get daily food amoutn is a method in the animal class that retrun tehr daily food amount for each animal in the array
			double averageDailyFood = totalDailyFood / AnimalCount;
			// calculate the average daily food amount for all animals in the rescue by dividing the total daily food amount by the current amount of animals in the rescue
			return averageDailyFood;
			//return the average daily food amount for all animals in the rescue
		}

		public void displayAnimalsAtOrAboveAverageDailyFood(double averageDailyFood)
		{
			// get the average daily food amount for all animals in the rescue
			for (int i = 0; i < AnimalCount; i++)
			{
				if (Animals[i].getdailyFoodAmount() >= averageDailyFood)
				{
					System.out.println(Animals[i].getName() + ": is at or above the daily food amount");
				}
				// uses a for loop and then goes to the postion in the array and then uses a .get name to get the name of the animals
			}
			// use a for loop to iterate through the array of animals in the rescue and display the name and daily food amount for each animal that is at or above the average daily food amount
		}

		

		
	}
	// end of the rescue class 
	

// end of the file 

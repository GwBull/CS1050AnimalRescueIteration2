
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

	
	RescueCenter rescue1 = new RescueCenter("Second Chance Rescue", 3);

	// creates a new rescxsue cenetr object with a name and max animals as 3
	// we dont need the animal count because it will be set to 0 in the constructor
	// and we dont need the animal array because it will be created in the constructor with a length of 3

	// creates a new rescue hardcoded to test. 

	Animal[] allAnimals = new Animal[4];
    // create the animal array to store hard coded animals 
	// its called all animal stores animals data type with a lenght of 4 

    allAnimals[0] = new Animal("Luna", "Dog", 20.0, 1.50);
	// stores luna in animal array position 0 with the name, species, weight and daily food amount
    allAnimals[1] = new Animal("Pip", "Bird", 0.8, 0.10);
    allAnimals[2] = new Animal("Rex", "Dog", 100.0, 3.00);
    allAnimals[3] = new Animal("Bella", "Cat", 8.0, 0.60);

	rescue1.addAnimal(allAnimals[0]);
	// adds luna to the array within the rescue object 
	rescue1.addAnimal(allAnimals[1]);
	// adds pip to the array within the rescue object
	rescue1.addAnimal(allAnimals[2]);
	// adds rex to the array within the rescue object
	rescue1.addAnimal(allAnimals[3]);
	//adds bela to the array wihtin the rescue object 
	//theses are all fo testing purposes and will be replaced with the read file method later
    
	// adds all these animals into the array

	// create and hardcode 4 animlas to test the class and the program

	displayProgramInformation();
	// call the display prgram method to display the program information

	}
	

	public static void displayProgramInformation()
		{
		System.out.println("**********************************************");
		System.out.println("Aniumal Rescue Center Analysis - Iteration 02");
		System.out.println("**********************************************");
		System.out.println("Reads Animal information from a file");
		System.out.println("Calculates average daily and total weekly food");
		System.out.println("writes rescue infromation and anylsis to a file");
		
	}
	// end of the display program information method 

// START THE READ FILE METHOD WILL BE IMPLMENTED LATER 

// START THE WRITE FILE METHOD WILL BE IMPLMENTED LATER

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
		
		public  Animal(String name, String species, double weight, Double dailyFoodAmount)
		
		{
		
			this.Name = name;
			
			this.Species = species;
			
			this.Weight = weight;
			
			this.dailyFoodAmount = dailyFoodAmount;
			
			/*
			 * This constructor creates a new Animal object and sets its starting values.
			 * Each parameter is equal to the  field of the object.
			 * "this." means "this specific instance assign this name to this specific animals"
			 * this.Name = Name;   // Georges Name becomes "Georges"
			 * Example:
			 *   Animal tom = new Animal("George", "Lion", 200.0, 8.0);
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
	class RescueCenter
	
	{
	
		private String RescueName;
		// create the attribute oof a rescue which is the name of the rescue
		private int AnimalCount;
		// create the attribute of a rescue which is the current amount of animals in the rescue
		private Animal[] Animals;
		// create the attribute of a rescue which is an array of animals in the rescue

		/*
		 * Create a new class called rescue thats a data type called Rescue
		 * the attributes of this class are the name of the rescue 
		 * the current amount of animals that will be used for the size of the array 
		 * an array that hold animals using the animal data type and the length of the array is based on the current animals 
		 * the maximum number of animals that can be in the rescue
		 */
		
		public RescueCenter(String RescueName, int MaxAnimals)

		// we dont need to pass through the animal count because it will be set to 0 in the constructor
		// we dont need to pass through the animal array because it will be created in the constructor with a length of MaxAnimals
		// creates a constructor for the recuse need to have max animals to set the array length 

		{
		
			this.RescueName = RescueName;
			
			this.AnimalCount = 0;
			// starts the animal count at 0 because there are no animals in the rescue yet
			this.Animals = new Animal[MaxAnimals];
			// creates an array that stores animals wiht the lenght set to the animal amount

		}
		//end of the constructor for the rescue class
		//this will create a new rescue object and set the starting values for the rescue name, animal count and the array of animals in the rescue

		public String getRescueName(){
			
			return this.RescueName;
		}
		// create get rescue name method to return the name of the rescue

		public int getAnimalCount(){
			
			return this.AnimalCount;
		}
		// create get animal count method to return the current amount of animals in the rescue

		public Animal[] getAnimals(){
			
			return this.Animals;
		}
		// create get animals method to return the array of animals in the rescue

		public void addAnimal(Animal animal)

		{

    	if (AnimalCount < Animals.length)

   	 	{

        AnimalCount++;
        System.out.println("Success! Animal added to the rescue");
        System.out.println("Updated animal count: " + AnimalCount);
    	}

   		 else

    	{

        System.out.println("Error the rescue is full! YOU CANNOT ADD NEW ANIMALS");
    	
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

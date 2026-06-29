/**
 * File: CS106A_99BottlesOfBeer.java
 * ----------------------------
 * This Java program sings the song "99 bottles of beer on the wall"
 * after asking the user how many bottles of beer they'd like to 
 * start with.
 */

import acm.program.*;

public class CS106A_99BottlesOfBeer extends ConsoleProgram
{	
	private static int startingNumberOfBottles;
	
	public void run()
	{ 
		introduceApp();
		promptUser();
		singSong();
	}
	
	
	private void introduceApp()
	{
		println("This Java program sings '99 bottles of beer on the wall' " +
				"but lets you choose the starting number. ");
	}
	
	
	private void promptUser()
	{
		startingNumberOfBottles = readInt("Input a positive integer as a starting value: ");
	}
	
	
	private void singSong()
	{
		for (int i = startingNumberOfBottles; i > 0; i--){
			//note: making the below iDecremented = i-- doesn't do what you think
			//it affects the original integer, decrementing THAT instead of storing
			//a totally separate value, which is what the below NOW does
			int iDecremented = i - 1;
			String grammaredBottle = " bottle" + (i > 1 ? "s":"") + " of beer";
			
			println(i + grammaredBottle + " on the wall.");
			println(i + grammaredBottle);
			println("You take one down and pass it around.");
			println(iDecremented + grammaredBottle + " on the wall.");
			println("");
		}
	}
}
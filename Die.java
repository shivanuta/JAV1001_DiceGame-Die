/*Student name : Shiva Rama Krishna Nutakki
Student Id : A00245380
Program Descripation: This code is all about Die. */

import java.util.Random;

public class Die {

	//declaring variables.
	public String type;
	public int noOfSides;
	public int currentSideUp;

	//constructor to roll the dice.
	public Die() {
		this.noOfSides = 6;
		this.type = "d6";
		this.roll();
	}

	//constructor to roll the dynamic dice.
	public Die(int noOfSides) {
		this.type = "d"+ noOfSides;
		this.noOfSides = noOfSides;
		this.roll();
	}
	//constructor to roll the Percentile dice.
	public Die(String type, int noOfSides) {
		this.type = type;
		this.noOfSides = noOfSides;
		this.percentileRoll();
	}


	//Getsides method has been created which returns no of sides.
	public int getSides(){
	  return noOfSides;
	}

	//Getcurrentsideup  method has been created which returns currentsideup.
	public int getCurrentSideUp(){
		return currentSideUp;
	}


	//Method that assigns the current side to currentSideUp variable of a die.
	public void roll()
	{
		Random rand = new Random();
		this.currentSideUp = (rand.nextInt(this.getSides())) + 1;
	}

	//Method that assigns the current side to currentSideUp variable of a percentile die.
	public void percentileRoll()
	{
		Random rand = new Random();
		this.currentSideUp = ((rand.nextInt(this.getSides())) + 1) * this.getSides();
	}
}

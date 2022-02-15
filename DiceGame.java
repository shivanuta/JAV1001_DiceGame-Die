/*
Student name : Shiva Rama Krishna Nutakki
Student Id : A00245380
Program Descripation: This code is all about DiceGame.
*/



public class DiceGame {
	public static void main(String args[])
	{
		System.out.println("Creating a default d6");
		//By using constructor creating an Object.
		Die d6 = new Die();


		System.out.println("Creating a d17");
		//By using constructor creating an Object.
		
		Die d17 = new Die(17);


		System.out.println("Creating a Percentile die (a special d10)");
		//By using constructor creating an Object.
		Die d10 = new Die("Percentile",10);

		//Displaying the results.
		System.out.println("The current side up for "+d6.type+" is "+d6.getCurrentSideUp());
		System.out.println("The current side up for "+d17.type+" is "+d17.getCurrentSideUp());
		System.out.println("The current side up for "+d10.type+" is "+d10.getCurrentSideUp());
		System.out.println("\n\nTesting the roll method\n\n");
		System.out.println("Rolling the "+d6.type+".......");
		d6.roll();
		System.out.println("The new value is "+d6.getCurrentSideUp());
		System.out.println("Rolling the "+d17.type+"......");
		d17.roll();
		System.out.println("The new value is "+d17.getCurrentSideUp());
		System.out.println("Rolling the "+d10.type+".......");
		d10.percentileRoll();
		System.out.println("The new value is "+d10.getCurrentSideUp());
		System.out.println("Creating 5 d6.......");
		Die dice1 = new Die();
		Die dice2 = new Die();
		Die dice3 = new Die();
		Die dice4 = new Die();
		Die dice5 = new Die();

		// successive rolls of the dice in an attempt to get a "YAHTZEE".
		int counter=1;
		while(!((dice1.getCurrentSideUp() == dice2.getCurrentSideUp()) && (dice2.getCurrentSideUp() == dice3.getCurrentSideUp()) && (dice3.getCurrentSideUp() ==  dice4.getCurrentSideUp()) && (dice4.getCurrentSideUp() ==  dice5.getCurrentSideUp())))
		{
			dice1.roll();
			dice2.roll();
			dice3.roll();
			dice4.roll();
			dice5.roll();
			counter++;
		}
		//Displays the YAHTZEE.
		System.out.println("YAHTZEE! it took "+counter+" rolls and the dice current side is " + dice1.getCurrentSideUp());
	}
}

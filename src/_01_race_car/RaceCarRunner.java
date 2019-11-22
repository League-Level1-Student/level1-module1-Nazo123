package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
	String w = "Gucci";
	
RaceCar e = new RaceCar(w,5);
	
		// 1. Create a RaceCar and place it in 5th position
	
		// 2. Print the RaceCar's position in the race
System.out.print("You are number "+e.getPositionInRace()+" in this race!");
		// 3. Crash the RaceCar
		e.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(e.isDamaged()) {
	

		e.pit();}
		// 5. Help the car move into first place
e.overtake();
e.overtake();e.overtake();
e.overtake();
e.overtake();
e.overtake();
e.overtake();
e.overtake();

	}
}

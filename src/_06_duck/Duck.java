package _06_duck;

public class Duck {
	

	String favoriteFood;
	int numberOfFriends;
		
		

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;


	}
	int distance = 0;
	void quack() {
		System.out.println("Quackz");
	}
	void waddle() {
		
		 distance++;
		 System.out.println("The duck has waddled "+distance+" meter(s) from the start");
		
	}
	
}

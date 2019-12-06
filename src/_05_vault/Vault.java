package _05_vault;

import java.util.Random;

public class Vault {
	
	
	int e;
	public Vault() {
		e= new Random().nextInt(1_000_001); 
	}
	public boolean tryCode(int trial) 
	{
		if (trial==e) {
		return true;
		}	
		else {
			return false;
		}
		
	}

}

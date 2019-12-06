package _05_vault;

import javax.swing.JOptionPane;

public class Vault_Runner {

	public static void main(String[] args) {
		
		
		Vault e = new Vault();
		JamesBond q = new JamesBond();
		System.out.println(q.findCode(e)+" is the code!");
	}
}

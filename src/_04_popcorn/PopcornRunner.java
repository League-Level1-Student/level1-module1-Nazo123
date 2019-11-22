package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Popcorn e = new Popcorn(JOptionPane.showInputDialog("What type of popcorn do you want?"));
	Microwave w = new Microwave();
	w.putInMicrowave(e);
	int time = Integer.parseInt(JOptionPane.showInputDialog("How long do you want to cook your popcorn?"));
	w.setTime(time);
	w.startMicrowave();
}
}

package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bianary implements ActionListener{
	JFrame e = new JFrame();
	JPanel r = new JPanel();
	JTextField answer = new JTextField(20);
	JButton s = new JButton();
	JLabel y = new JLabel();
	public void converter() {
		

e.setTitle("Convert 8 bits of binary to ASCII");
		s.setText("Convert");
	r.add(answer);
	r.add(y);
	r.add(s);
	e.add(r);

	e.pack();
	
	e.setVisible(true);
	s.addActionListener(this);
	
}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String thing = convert(answer.getText());
	y.setText(thing);
}

}

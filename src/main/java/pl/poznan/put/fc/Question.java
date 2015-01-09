package pl.poznan.put.fc;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Question {
	private String question;
	
	public Question(String question) {
		this.question = question;
		System.out.println(this.question);
	}
	
	public void askYesNo() {
		Object[] options = { "TAK", "NIE" };
		int ans = JOptionPane.showOptionDialog(null, question, "Car Mechanic Question", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		if (ans == 0) {
			return true;
		} else {
			return false; //to be done
		}
	}
	
	public void askInput() {
		
	}
}

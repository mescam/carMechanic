package pl.poznan.put.fc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pl.poznan.put.fc.Fact;

public class Question {
	private String question;
	private Object[] answers;
	private String[] facts;
	
	public Question(String question, Object[] answers, String[] facts) {
		this.question = question;
		this.answers = answers;
		this.facts = facts;
	}
	
	public Fact ask() {
		int ans = JOptionPane.showOptionDialog(null, question, "Car Mechanic Question", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, answers, answers[0]);
		return new Fact(facts[ans]);
	}
	
	public void askInput() {
		
	}
}

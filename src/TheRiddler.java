import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
	// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog ("What has an eye but can not see?");
String answer2 = "a needle";
if (answer1.equals(answer2))
{ JOptionPane.showMessageDialog(null, "Correct!");
score ++;
}

else {
	JOptionPane.showMessageDialog(null, "Wrong! Correct answer is " + answer2);
	
}
JOptionPane.showMessageDialog(null, "Score is " + score);
	
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}


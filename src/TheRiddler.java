import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: 
String riddle=JOptionPane.showInputDialog("What comes down but never goes up?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("rain")) {
JOptionPane.showMessageDialog(null, "Correct!");
score=score+1;

}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is rain");
}
		// 6. Add some more riddles
String riddle2=JOptionPane.showInputDialog("What word becomes shorter when you add two letters to it?");
if(riddle2.equals("short")) {
JOptionPane.showMessageDialog(null, "Correct!");
score=score+1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is short");
}
String riddle3=JOptionPane.showInputDialog("What goes up but never comes down?");
if(riddle3.equals("age")) {
JOptionPane.showMessageDialog(null, "Correct!");
score=score+1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is age");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score: "+score);
	}
}


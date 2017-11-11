//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String jarenspower="teleportation";
String mattspower="invisibility";
String kevinspower="flying";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("Who's super power do you want");

		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("matt")){
		JOptionPane.showMessageDialog(null, "Your super power is "+mattspower);
	}
else if(name.equals("jaren")){
	JOptionPane.showMessageDialog(null, "Your super power is "+jarenspower);
}
else if(name.equals("kevin")){
		JOptionPane.showMessageDialog(null, "Your super power is "+kevinspower);
	}
	else { 
		JOptionPane.showMessageDialog(null, "Your don't have a superpower");
	}
}
}
	
	



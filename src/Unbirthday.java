import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer= JOptionPane.showInputDialog("When is your birthday?");
if(answer.equals("2/11/18")) {
JOptionPane.showMessageDialog(null, "Happy birthday!");}
else {JOptionPane.showMessageDialog(null, "Happy unbirthday!");}

	}

}

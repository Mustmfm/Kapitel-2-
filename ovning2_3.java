import javax.swing.*;
/*
ett program som visar namn och efternamn.
Mustafa abdulrazzaq
9/25/2017
 */

public class ovning2_3{
	public static void main(String[] args) {
		String fornamn;
		String efternamn;

		efternamn = JOptionPane.showInputDialog("vad är ditt efternamn?");
		fornamn = JOptionPane.showInputDialog("vad är ditt fornamn?");
		JOptionPane.showMessageDialog(null,fornamn + " " + efternamn);	
		}
	}
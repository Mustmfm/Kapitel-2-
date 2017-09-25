import javax.swing.*;
/*
Vissa danska bokstäver
Mustafa abdulrazzaq
9/25/2017
 */

public class ovning2_7 {
	public static void main(String[] args) {

		char c1;
		char c2;
		String s;
	
		c1 = '\u00D8';
		c2 = '\u00F8';
		s = " " + c1 + c2 ;
		JOptionPane.showMessageDialog(null, s );
	}
}

package uebung01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HalloFamilie extends JFrame {

	
	String[] namen = {"Lukas", "Emily", "Alfred", "Tanja", "Mia" };
	
	/**
	 * @param spalten 
	 * @param zeilen 
	 * 
	 */
	public HalloFamilie(int zeilen, int spalten) {
		initUI(zeilen, spalten);
	}
	
	
	
	
	
	private void initUI(int zeilen, int spalten) {
		Container c = getContentPane();
		
//		c.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
		c.setLayout(new GridLayout(zeilen, spalten, 25, 25));
		
		for(String name : namen) {
			c.add(new JLabel(name));
		}
		
	}





	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		int zeilen = Integer.parseInt(args[0]);
		int spalten = Integer.parseInt(args[1]);
		
		HalloFamilie frame = new HalloFamilie(zeilen, spalten);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	
	
	
}

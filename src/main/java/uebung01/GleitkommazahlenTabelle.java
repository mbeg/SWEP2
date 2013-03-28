package uebung01;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GleitkommazahlenTabelle extends JFrame {

	public GleitkommazahlenTabelle(int zeilen, int spalten, float... f) {
	
		setLayout(new GridLayout(zeilen, spalten));
		
		for (float g : f) {
			add(new JLabel(String.valueOf(g)));
		}
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GleitkommazahlenTabelle frame = new GleitkommazahlenTabelle(2, 3, 3.2f, 45f, 44f, 33f, 45f, 44f, 99f);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

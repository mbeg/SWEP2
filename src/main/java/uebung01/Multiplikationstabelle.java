package uebung01;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Multiplikationstabelle extends JFrame {
	
	/**
	 * @param laufVariable
	 * @param konstanterMultiplikator
	 */
	public Multiplikationstabelle(int laufVariable, int konstanterMultiplikator) {
		initUI(laufVariable, konstanterMultiplikator);
	}
	
	
	/**
	 * @param laufVariable
	 * @param konstanterMultiplikator
	 */
	private void initUI(int laufVariable, int konstanterMultiplikator) {
		
		Container contentContainer = getContentPane();
		GridLayout gl = new GridLayout(laufVariable, 5, 0, 20);

		contentContainer.setLayout(gl);
		
		for (int i = 1; i <= laufVariable; i++) {
			
			JLabel lblLaufvariable = new JLabel(String.valueOf(i));
			JLabel lblProduktzeichen = new JLabel("x");
			JLabel lblKonstanterMultiplikator = new JLabel(String.valueOf(konstanterMultiplikator));
			JLabel lblIstGleichZeichen = new JLabel("=");
			JLabel lblErgebnis = new JLabel(String.valueOf(i*konstanterMultiplikator));
			
			contentContainer.add(lblLaufvariable);
			contentContainer.add(lblProduktzeichen);
			contentContainer.add(lblKonstanterMultiplikator);
			contentContainer.add(lblIstGleichZeichen);
			contentContainer.add(lblErgebnis);
			
			// unterschiedliche Farbe
			if((i&1)==0) {
				lblLaufvariable.setOpaque(true);
				lblLaufvariable.setBackground(Color.lightGray);
				lblProduktzeichen.setOpaque(true);
				lblProduktzeichen.setBackground(Color.lightGray);
				lblKonstanterMultiplikator.setOpaque(true);
				lblKonstanterMultiplikator.setBackground(Color.lightGray);
				lblIstGleichZeichen.setOpaque(true);
				lblIstGleichZeichen.setBackground(Color.lightGray);
				lblErgebnis.setOpaque(true);
				lblErgebnis.setBackground(Color.lightGray);
			}
			
		}
		
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Multiplikatiion von m in n-Zeilen
		// mit den ersten n-Koefffizienten an
		int laufVariable = Integer.parseInt(args[0]);
		int konstanterMultiplikator = Integer.parseInt(args[1]);
		

		Multiplikationstabelle frame = new Multiplikationstabelle(laufVariable, konstanterMultiplikator);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}

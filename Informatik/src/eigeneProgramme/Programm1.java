package eigeneProgramme;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import hilfe.*;

public class Programm1 extends HJFrame {
	// globale Variablen
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	private static final Color BACKGROUND = Color.PINK;
	private static final Color FOREGROUND = Color.BLACK;

	public Programm1(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung
	}
		public void gespenst (Graphics g, int x, int y){
			g.setColor(Color.blue);
			g.fillOval(20, 20, 50, 50);
			g.drawOval(30, 30, 70, 70);
			
		}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird
		
	}

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programm1 anwendung = new Programm1("Programm1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
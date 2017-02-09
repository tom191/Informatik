package eigeneProgramme;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import hilfe.*;

public class farben extends HJFrame {
	// globale Variablen
	static final Color DunkelGrün = new Color(0, 100, 0);
	static final Color Braun = new Color(139, 69, 19);
	private static final int WIDTH = 800;
	private static final int HEIGHT = 700;
	static final Color beige = new Color(255, 211, 155);
	private static final Color BACKGROUND = beige;
	private static final Color FOREGROUND = Color.BLACK;

	public farben(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung

	}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird
		baum(g, 100, 100);
		baum(g, 200, 50);
		baum(g, 20, 80);
		for (int x = 0; x < 5; x++){
			baum(g, x * 60 + 400, 50);
		}
			int anzahlBäume = 0;
			
			for (int y = 0; y < 6; y++) {
				for (int x = 0; x < 15; x++) {
					anzahlBäume++;
					if (anzahlBäume % 6 != 0) {
						baum (g, x * 40 + 100, 220 + y * 70);
					}
				}
			}
		}

	public void baum(Graphics g, int x, int y) {
		g.setColor(DunkelGrün);
		g.fillOval(x, y, 50, 50);
		g.setColor(Braun);
		g.fillRect(x+20, y+50, 10, 50);

	}

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					farben anwendung = new farben("farben");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
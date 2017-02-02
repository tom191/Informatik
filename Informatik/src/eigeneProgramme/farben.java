package eigeneProgramme;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import hilfe.*;

public class farben extends HJFrame {
	// globale Variablen
	static final Color DunkelGrün = new Color(0,100,0);
	static final Color Braun = new Color (139,69,19);
	private static final int WIDTH = 800;
	private static final int HEIGHT = 700;
	static final Color beige = new Color(255,211,155);
	private static final Color BACKGROUND = beige;
	private static final Color FOREGROUND = Color.BLACK;

	public farben(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung
		
	}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird
		g.setColor(DunkelGrün);
		g.fillOval(20, 80, 50, 50);
		g.setColor(Braun);
		g.fillRect(40, 130, 10, 50);
		g.setColor(DunkelGrün);
		g.fillOval(100, 100, 50, 50);
		g.setColor(Braun);
		g.fillRect(120, 150, 10, 50);
		g.setColor(DunkelGrün);
		g.fillOval(200, 200, 50, 50);
		g.setColor(Braun);
		g.fillRect(220, 250, 10, 50);
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
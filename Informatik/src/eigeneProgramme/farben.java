package eigeneProgramme;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import hilfe.*;

public class farben extends HJFrame {
	// globale Variablen
	private static final int WIDTH = 800;
	private static final int HEIGHT = 700;
	static final Color beige= new Color(255,211,155);
	private static final Color BACKGROUND = beige;
	private static final Color FOREGROUND = Color.BLACK;

	public farben(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung
		
	}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird

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
package klassenundobjekte;

import java.awt.Color;
import javax.swing.Timer;
import java.awt.EventQueue;
import java.awt.Graphics;
import hilfe.*;

public class HundAnwendung extends HJFrame {
	// globale Variablen
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private static final Color BACKGROUND = Color.WHITE;
	private static final Color FOREGROUND = Color.BLACK;
	public Hund max;
	public Hund kevin;
	public Hund lul;
	public Hund aleks;
	
	public HundAnwendung(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung
		Timer timer = new Timer(50, this);
		timer.start();
		max = new Hund(100, 30, Color.GREEN);
		kevin = new Hund (200,60, Color.BLACK);
		lul = new Hund (50, 60, Color.PINK);
		aleks = new Hund (40,100, Color.RED);
	}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird
		max.springen(g);
		kevin.springen(g);
		lul.stehen(g);
		aleks.stehen(g);
		
	}

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HundAnwendung anwendung = new HundAnwendung("HundAnwendung");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
package klassenundobjekte;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.management.timer.Timer;

import hilfe.*;
import klassen.Raupe;

public class raupeanwendung extends HJFrame {
	// globale Variablen
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private static final Color BACKGROUND = Color.WHITE;
	private static final Color FOREGROUND = Color.BLACK;
	int x = 0;
	int j= 0 ;
	int p= 0;
	Raupe tom;
	Raupe lol;
	public raupeanwendung(final String title) {
		super(WIDTH, HEIGHT, BACKGROUND, FOREGROUND, title);
		// eigene Initialisierung
		Timer timer = new Timer (100, this);
		timer.start();
		tom = new Raupe(p, 100, Color.GREEN, 10);
	}

	@Override
	public void myPaint(Graphics g) {
		// wird aufgerufen, wenn das Fenster neu gezeichnet wird
		tom.bewegen(g);
	}

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					raupeanwendung anwendung = new raupeanwendung("raupeanwendung");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
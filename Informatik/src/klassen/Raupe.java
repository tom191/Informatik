package klassen;

import java.awt.Color;
import java.awt.Graphics;

public class Raupe {
	private int x;
	private int y;
	private Color farbe;
	public int ges = 0;
	private int j;
	
	public Raupe (int x, int y, Color farbe, int ges) {
		this.x = x;
		this.y = y;
		this.farbe = farbe;
		this.ges = ges;
	}
	public void kriechen (Graphics g){	
		zeichnen (g, false);
		
	}
	
	public void liegen(Graphics g){
		zeichnen (g, true);
	}
	
	public void zeichnen (graphics g, boolean liegen)
}
}
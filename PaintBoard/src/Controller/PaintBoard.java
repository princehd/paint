package Controller;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class PaintBoard extends Canvas{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(255, 0, 0));
		g.drawLine(0, 0, 10, 10);
		g.setColor(new Color(0, 255, 0));
		g.drawRect(100, 100, 50, 50);
	}
	
}

package Model;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Figure{
	private int x,y,width,height;
	private Color color;

	public Rect(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}
	
	
}

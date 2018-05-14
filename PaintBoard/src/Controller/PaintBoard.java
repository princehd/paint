package Controller;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;

import Model.Figure;
import Model.Line;
import Model.Rect;

public class PaintBoard extends Canvas{

	ArrayList<Figure> list = new ArrayList<>();
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		for (Figure figure : list) {
			if(figure instanceof Line){
				Line line = (Line)figure;
				g.setColor(line.getColor());
				g.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2());
			}
			else if(figure instanceof Rect){
				Rect rect = (Rect)figure;
				g.setColor(rect.getColor());
			}
		}
	}

	public void addFigure(Figure figure) {
		// TODO Auto-generated method stub
		list.add(figure);
	}
	
}

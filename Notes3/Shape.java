import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	int x;
	int y;
	int width;
	int height;
	Color color;
	
	public abstract void draw(Graphics g);
}

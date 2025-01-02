
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape implements Print{

	public Square(int x, int y, int width, int height, Color color) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);		
	}
	
	@Override
	public void printName() {

	}

}
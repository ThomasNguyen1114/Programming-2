package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GameObject{
    
    public Circle(int x, int y, int width, int height, Color color) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x, this.y, this.width, this.height);
		
	}
    @Override
    public void update() {
        this.y = this.y + 2;
        if(this.y > 600) {
            this.y = -10;
        }
    }

}

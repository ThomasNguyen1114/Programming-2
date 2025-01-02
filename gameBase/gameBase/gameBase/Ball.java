package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
    private int horizontal = 20;
    private int vertical = 20;
    
    public Ball(int x, int y, int width, int height, Color color) {
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
        this.x += horizontal;
        this.y += vertical;

        if (this.x <= 0 || this.x + this.width >= 800) {
            this.horizontal = -this.horizontal; 
        }
        if (this.y <= 0 || this.y + this.height >= 600) {
            this.vertical = -this.vertical; 
        }
    }
}

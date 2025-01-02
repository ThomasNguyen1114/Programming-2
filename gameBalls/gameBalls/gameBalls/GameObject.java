package gameBalls;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {
    int x, y, width, height;
    Color color;
        
    public abstract void draw(Graphics g);
    public abstract void update();
}

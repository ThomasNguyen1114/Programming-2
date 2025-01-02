package gameBase;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {
    int x;
    int y;
    int width;
    int height;
    Color color;
        
    public abstract void draw(Graphics g);
    public abstract void update();
}

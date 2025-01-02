package gameBase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	Dimension dim;
	GameObject[] gameObjects;
	Timer gameLoop;
	Random rand = new Random();
	
	public GamePanel(Dimension dim) {
		super();
		this.dim = dim;
		this.setPreferredSize(dim);
		this.setBackground(Color.black);
		
		gameObjects = new GameObject[14];
		gameObjects[0] = new Square(20, 20, 50, 50, Color.blue);
		gameObjects[1] = new Circle(50,80,100,100, Color.red);
		gameObjects[2] = new Square(200, 200, 60, 60, Color.green);
		gameObjects[3] = new Circle(250,90,100,100, Color.yellow);
		gameObjects[4] = randomBall();
		gameObjects[5] = randomBall();
		gameObjects[6] = randomBall();
		gameObjects[7] = randomBall();
		gameObjects[8] = randomBall();
		gameObjects[9] = randomBall();
		gameObjects[10] = randomBall();
		gameObjects[11] = randomBall();
		gameObjects[12] = randomBall();
		gameObjects[13] = randomBall();

		
		gameLoop = new Timer(30, this);
		gameLoop.start();
	}
	public Ball randomBall(){
		int size = 30 + rand.nextInt(71);
		int x = rand.nextInt(dim.width - size);
		int y = rand.nextInt(dim.height - size);
		Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		return new Ball(x, y, size, size, color);
	}
	public void draw(Graphics g) {
		
		int index;
		for(index=0;index<this.gameObjects.length; index++) {
			this.gameObjects[index].draw(g);
		}
	}
	
	public void update() {
		
		int index;
		for(index=0;index<this.gameObjects.length; index++) {
			this.gameObjects[index].update();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Draw GameObjects
		this.draw(g);
		
		Toolkit.getDefaultToolkit().sync();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
		this.repaint();
	}

}

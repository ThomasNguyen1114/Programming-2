package gameBalls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	Dimension dim;
	GameObject[] gameObjects;
	Player player;
	Timer gameLoop;
	
	public GamePanel(Dimension dim) {
		super();
		this.dim = dim;
		this.setPreferredSize(dim);
		this.setBackground(Color.black);
		gameObjects = new GameObject[3];
		gameObjects[0] = new Square(20, 20, 40, 40, Color.red);
		gameObjects[1] = new Square(100, 100, 40, 40, Color.yellow);
		gameObjects[2] = new Square(200, 200, 40, 40, Color.green);
		player = new Player(400, 500, 75, 50, Color.blue, 10);
		this.addKeyListener(player);
		this.setFocusable(true);

		gameLoop = new Timer(30, this);
		gameLoop.start();
	}

	public void draw(Graphics g){
		int index;

		for(index = 0; index < this.gameObjects.length; index++){
			this.gameObjects[index].draw(g);
		}

		player.draw(g);
		
	}
	public void update(){
		int index;

		for(index = 0; index < this.gameObjects.length; index++){
			this.gameObjects[index].update();
		}
		
		player.update();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
		Toolkit.getDefaultToolkit().sync();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
		this.repaint();
	}

}

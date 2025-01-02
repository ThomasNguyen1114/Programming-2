import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Dimension dim;
	private Color bgColor;
	Circle circle;
	Square square;
	Shape[] theArray;
	Print[] interfaces;
	Student1 student;
	
	public Color getBgColor() {
		return bgColor;
	}

	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}

	public MyPanel(int width, int height, Color bgColor) {
		dim = new Dimension(width,height);
		this.setPreferredSize(dim);
		this.setMaximumSize(dim);
		this.setMinimumSize(dim);
		this.setBgColor(bgColor);
		this.setBackground(this.getBgColor());
		
		theArray = new Shape[3];
		circle = new Circle(50,50,50,50,Color.red);
		square = new Square(200,200,100,100,Color.green);
		student = new Student1();
		theArray[0] = circle;
		theArray[1] = square;
		theArray[2] = new Square(150, 150, 30, 30, Color.blue);

		interfaces[0] = square;
		interfaces[1] = student;
	}

	public void draw(Graphics g){
		int index;

		for(index = 0; index < this.theArray.length; index++){
			theArray[index].draw(g);
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.draw(g);
	}
}

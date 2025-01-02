import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	Dimension dim;
	MyPanel panel;
	
	public MyWindow(String title, int width, int height, Color bgColor) {
		super(title);
		dim = new Dimension(width,height);
		this.setMaximumSize(dim);
		this.setMinimumSize(dim);
		this.setPreferredSize(dim);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.panel = new MyPanel(width,height,bgColor);
		this.add(panel);
	
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){
		MyWindow win = new MyWindow("Another Window",800,600,Color.black);
		MyWindow win1 = new MyWindow("Small Window",400,300,Color.white);
	}
}


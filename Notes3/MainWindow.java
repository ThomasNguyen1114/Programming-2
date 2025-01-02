
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {

	public static void main(String[] args) {
		JFrame win = new JFrame("Main Window");
		Dimension dim = new Dimension(800,600);
		win.setMaximumSize(dim);
		win.setMinimumSize(dim);
		win.setPreferredSize(dim);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(dim);
		panel.setMaximumSize(dim);
		panel.setMinimumSize(dim);
		panel.setBackground(Color.black);
		win.add(panel);
		win.pack();
		win.setVisible(true);
	}
}

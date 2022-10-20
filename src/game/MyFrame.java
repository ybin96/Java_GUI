package game;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("My Game");
		add(new MyPanel());
		setSize(550, 550);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}

}

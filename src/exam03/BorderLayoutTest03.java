package exam03;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest03 extends JFrame {
	
	public BorderLayoutTest03() {
		setLayout(new BorderLayout());
		// add(new JButton("위"),BorderLayout.NORTH);
//		add(new JButton("아래"),BorderLayout.SOUTH);
//		add(new JButton("좌"),BorderLayout.WEST);
		add(new JButton("우"),BorderLayout.EAST);
		add(new JButton("가운데"),BorderLayout.CENTER);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutTest03();

	}

}

package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLabelTest extends JFrame {
	ImageIcon icon_apple;
	ImageIcon icon_banana;
	JLabel jlb;
	
	public ImageLabelTest() {
		icon_apple = new ImageIcon("apple.png");
		icon_banana = new ImageIcon("banana.jpg");
		setLayout(new FlowLayout());
		jlb = new JLabel(icon_apple);
		add(jlb);
		
		JButton btn_apple = new JButton("사과");
		JButton btn_banana = new JButton("바나나");
		add(btn_apple);
		add(btn_banana);
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_apple.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setIcon(icon_apple);
				
			}
		});
		btn_banana.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setIcon(icon_banana);
				
			}
		});
	}
	
	public static void main(String[] args) {
		new ImageLabelTest();

	}

}

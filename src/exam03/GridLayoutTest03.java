package exam03;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest03 extends JFrame {
	public GridLayoutTest03() {
		setLayout(new GridLayout(3,5)); // 3행 5열로 배치된다
		for(int i=1;i<=12;i++) {
			add(new JButton("버튼"+i));
		}
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기조절 유무를 정한다. false면 크기조절 불가능
	}
	
		
	public static void main(String[] args) {
		new GridLayoutTest03();
	}

}

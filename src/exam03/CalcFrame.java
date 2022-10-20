package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame {
	JTextField jtf01;
	JTextField jtf02;
	JTextField jtf03;
	
	
	public CalcFrame () {
		
		setLayout(new FlowLayout()); // 물흐르듯이 배치하게 만든다
		jtf01 = new JTextField(5);
		jtf02 = new JTextField(5);
		jtf03 = new JTextField(5);
		
		JLabel label = new JLabel("+"); // 중간에 +표시해준다
		
		JButton btn = new JButton("=");
		// 차례대로 담는다
		add(jtf01);
		add(label);
		add(jtf02);
		add(btn);
		add(jtf03);
		
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(jtf01.getText());
			int b = Integer.parseInt(jtf02.getText());
			int c = a+b;
			jtf03.setText(c+""); // ""은 String으로 형변환
				
			}
		});
	}

	public static void main(String[] args) {
		new CalcFrame();

	}

}

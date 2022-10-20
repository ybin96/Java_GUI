package exam03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcFrameAWT extends Frame {
	TextField jtf01;
	TextField jtf02;
	TextField jtf03;
	
	
	public CalcFrameAWT () {
		
		setLayout(new FlowLayout()); // 물흐르듯이 배치하게 만든다
		jtf01 = new TextField(5);
		jtf02 = new TextField(5);
		jtf03 = new TextField(5);
		
		Label label = new Label("+"); // 중간에 +표시해준다
		
		Button btn = new Button("=");
		// 차례대로 담는다
		add(jtf01);
		add(label);
		add(jtf02);
		add(btn);
		add(jtf03);
		
		setSize(300,150);
		setVisible(true);
	
		
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
		new CalcFrameAWT();

	}

}

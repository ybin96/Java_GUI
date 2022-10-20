package exam03;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RandomTest02 extends JFrame {
	JTextField jtf;
	JLabel jl;
	int n = 0 ;
	int cnt = 0;
	
	public RandomTest02() {
		setTitle("숫자맞추기");
		jtf = new JTextField(5);
		jl = new JLabel();
		setLayout(new FlowLayout());
		JButton btn = new JButton("클릭");
		
		add(new JLabel("숫자맞추기"));
		add(jtf);
		add(btn);
		add(jl);
		
		setSize(600,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		int a = r.nextInt(100)+1;
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n = Integer.parseInt(jtf.getText());
				if( n == a) {
					jl.setText("정답입니다, 시도횟수는"+cnt);
					
				}else if (n < a) {
					jl.setText("더 큰수를 입력");
					cnt += 1;
				}else {
					jl.setText("더 작은수를 입력");
					cnt += 1;
				}
			}
		});
	
	}
	
	public static void main(String[] args) {
		new RandomTest02();

	}

}

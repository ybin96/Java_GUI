package exam01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RandomTest extends JFrame {

	JTextField jtf;
	JLabel jl_hint;
	JButton btn_ok;
	JButton btn_retry;
	JButton btn_exit;
	
	public RandomTest() {
		setTitle("숫자게임");
		jtf = new JTextField(10);
		jl_hint = new JLabel("힌트");
		btn_ok = new JButton("확인");
		btn_retry = new JButton("다시시도");
		btn_exit = new JButton("종료");
		
		setLayout(new GridLayout(3,1));
		JPanel jp01 = new JPanel();
		jp01.add(new JLabel("숫자를 추측하시오"));
		jp01.add(jtf);
		jp01.add(btn_ok);
		JPanel jp02 = new JPanel();
		jp02.add(jl_hint);
		JPanel jp03 = new JPanel();
		jp03.add(btn_retry);
		jp03.add(btn_exit);
		
		add(jp01);
		add(jp02);
		add(jp03);
		
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		int a = r.nextInt(100)+1;
		
		btn_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int c = Integer.parseInt(jtf.getText());
				if(a == c) {
					String str = "정답입니다";
					jl_hint.setText(str);
					jp02.setBackground(Color.green);
				}else if(a < c) {
					String str = "너무 높아요";
					jl_hint.setText(str);
					jp02.setBackground(Color.red);
				}else {
					String str = "너무 낮아요";
					jl_hint.setText(str);
					jp02.setBackground(Color.red);
				}
			}
		});
		btn_retry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
			}
		});
		btn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
	}
	public static void main(String[] args) {
		new RandomTest();

	}

}

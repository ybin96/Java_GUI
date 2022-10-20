package exam03;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FactorialTest extends JFrame {
	JTextField jtf_in;
	JLabel jtf_out;
	
	public FactorialTest() {
		setTitle("Factorial 구하기");
		jtf_in = new JTextField(10);
		jtf_out = new JLabel("             ");
		setLayout(new FlowLayout());
		add(new JLabel("임의의 수 N을 입력하시오"));
		add(jtf_in);
		JButton btn = new JButton("결과");
		add(btn);
		add(new JLabel("결과:"));
		add(jtf_out);
		
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jtf_in.getText());
				int sum = 1;
				for(int i=1;i<=n;i++) {
					sum *= i;
				}
				jtf_out.setText(sum+"");
			}
		});
	}
	
	public static void main(String[] args) {
		new FactorialTest();

	}

}

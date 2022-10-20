package exam03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RandomTest extends JFrame {
	JTextField jtf;
	JLabel jl;
	JLabel jl2;
	int cnt = 0;
	
	
	public RandomTest() {
		setTitle("컴퓨터가 생각하는 숫자 맞추기");
		setLayout(new BorderLayout());
		jl = new JLabel();
		jl2 = new JLabel();
		jtf = new JTextField();

		JButton btn = new JButton("버튼");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p1.add(jtf, BorderLayout.CENTER);
		p1.add(btn, BorderLayout.EAST);
		p2.add(jl, BorderLayout.CENTER);	
		p2.add(jl2, BorderLayout.SOUTH);

		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random r = new Random();
		int n = r.nextInt(100) + 1;

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(jtf.getText());
					if (a == n) {
						jl.setText("정답" );
						jl2.setText("시도한 횟수:"+cnt+"");
					} else if (a < n) {
						jl.setText("올려");
						cnt += 1;
					} else {
						jl.setText("내려");
						cnt += 1;
				}
				
			}
		});

	}

	public static void main(String[] args) {
		new RandomTest();
	}

}

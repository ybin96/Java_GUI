package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUITest extends JFrame {
	JTextField jtf_name;	
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JTextField jtf_avg;
	
	public GUITest () {
		jtf_name = new JTextField(5);
		jtf_kor = new JTextField(5);
		jtf_eng = new JTextField(5);
		jtf_math = new JTextField(5);
		jtf_avg = new JTextField(5);
		
		setLayout(new FlowLayout());
		add(new JLabel("이름:"));
		add(jtf_name);
		add(new JLabel("국어:"));
		add(jtf_kor);
		add(new JLabel("영어:"));
		add(jtf_eng);
		add(new JLabel("수학:"));
		add(jtf_math);
		
		JButton btnOK = new JButton("평균계산");
		add(btnOK);
		add(jtf_avg);
		setSize(800,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				int avg = (kor+eng+math)/3;
				jtf_avg.setText(avg+"");
				// jtf_avg.setText(String.format
			}
		});
	}

	public static void main(String[] args) {
		new GUITest();

	}

}

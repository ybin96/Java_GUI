package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame {

	JRadioButton jrb01;
	JRadioButton jrb02;
	JLabel jlb;
	ButtonGroup bg01;

	public JRadioButtonTest() {
		bg01 = new ButtonGroup();
		setLayout(new FlowLayout());
		jrb01 = new JRadioButton("사과");
		jrb02 = new JRadioButton("포도");
		bg01.add(jrb01);
		bg01.add(jrb02);
		jlb = new JLabel("아무것도 선택하지 않았습니다");
		add(jrb01);
		add(jrb02);
		add(jlb);

		jrb01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setText("사과를 선택하였습니다");

			}
		});

		jrb02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setText("포도를 선택하였습니다");

			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JRadioButtonTest();

	}

}

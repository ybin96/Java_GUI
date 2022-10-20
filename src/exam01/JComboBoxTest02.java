package exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxTest02 extends JFrame {
	JComboBox<String> jcb;
	Vector<String> data; // combo에 들어가는 data
	JPanel jp;

	public JComboBoxTest02() {
		data = new Vector<String>();
		data.add("blue");
		data.add("red");
		data.add("yellow");
		data.add("green");

		jcb = new JComboBox<String>(data);
		setLayout(new BorderLayout());
		jp = new JPanel();

		add(jcb, BorderLayout.NORTH);
		add(jp, BorderLayout.CENTER);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jcb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String color = (String) jcb.getSelectedItem();
				if (color == "red") {
					jp.setBackground(Color.red);
				} else if (color == "green") {
					jp.setBackground(Color.green);
				} else if (color == "blue") {
					jp.setBackground(Color.blue);
				} else {
					jp.setBackground(Color.yellow);
				}
			}
		});

	}

	public static void main(String[] args) {
		new JComboBoxTest02();

	}

}

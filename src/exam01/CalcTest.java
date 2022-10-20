package exam01;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcTest extends JFrame {
	JTextField out;
	int op1, op2;
	String op;

	public CalcTest() {
		String[] arr = { "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "C", "0", "=", "/" };

		out = new JTextField();
		JButton[] btn = new JButton[arr.length];
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(arr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand(); // 만약 1을누르면 1이 testField에 보여진다
					if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
						op1 = Integer.parseInt(out.getText());
						op = cmd;
						out.setText("");

						System.out.println("op1:" + op1);
						System.out.println("op:" + op);
					} else if (cmd.equals("=")) {
						op2 = Integer.parseInt(out.getText());
						int result = 0;
						switch (op) {
						case "+":
							result = op1 + op2;
							break;
						case "-":
							result = op1 - op2;
							break;
						case "*":
							result = op1 * op2;
							break;
						case "/":
							result = op1 / op2;
							break;
						}
						out.setText(result + "");
					} else {

						out.setText(out.getText() + cmd);
					}
				}
			});
		}
		add(out, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CalcTest();
	}

}

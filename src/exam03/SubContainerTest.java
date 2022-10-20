package exam03;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SubContainerTest extends JFrame {
	public SubContainerTest() {
		setLayout(new BorderLayout());
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		JTextField jtf = new JTextField();
		JButton btn = new JButton("버튼");
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());  
		p.add(jtf,BorderLayout.CENTER);
		p.add(btn, BorderLayout.EAST);
		
		add(jsp,BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SubContainerTest();

	}

}

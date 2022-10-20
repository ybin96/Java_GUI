package practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITCPClient extends JFrame {
	JTextField jtf;
	JTextArea jta;
	InputStream is;
	OutputStream os;
	Socket socket;

	public GUITCPClient() {

		jtf = new JTextField();
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		JButton btn = new JButton("클릭");
		JLabel jl = new JLabel("문장입력");
		JPanel j = new JPanel();
		j.setLayout(new BorderLayout());

		j.add(jl, BorderLayout.WEST);
		j.add(jtf, BorderLayout.CENTER);
		j.add(btn, BorderLayout.EAST);

		add(jsp, BorderLayout.CENTER);
		add(j, BorderLayout.NORTH);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			Socket socket = new Socket("192.168.25.4", 9007);
			is = socket.getInputStream();
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("예외처리:" + e.getMessage());
		}

		class ClientThread extends Thread {
			byte[] data = new byte[100];

			public void run() {
				while (true) {
					try {
						is.read(data);
						String msg = new String(data);
						msg = msg.toUpperCase();
						System.out.println("메세지:" + msg);
						jta.append(msg + "\n");
						Arrays.fill(data, (byte) 0);

					} catch (Exception e) {
						System.out.println("예외처리:" + e.getMessage());
					}
				}
			}
		}
		ClientThread ct = new ClientThread();
		ct.start();

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = jtf.getText();

				try {
					os.write(msg.getBytes());
				} catch (Exception e2) {
					System.out.println("예외처리:" + e2.getMessage());
				}
			}
		});
	}

	public static void main(String[] args) {
		new GUITCPClient();

	}

}

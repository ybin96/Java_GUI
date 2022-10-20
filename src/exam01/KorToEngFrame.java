package exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KorToEngFrame extends JFrame {

	JTextArea jta_kor;
	JTextArea jta_eng;
	
	public String toEng(String kor) {  //반환하는 메소드
		String eng = "";
		eng = kor.replace("텍스트", "Text");
		eng = eng.replace("영어", "english");
		return eng;
	}
	
	public KorToEngFrame() {
		setTitle("텍스트 변환");
		
		jta_kor = new JTextArea();
		jta_eng = new JTextArea();
		JPanel jp01 = new JPanel();
		jp01.setLayout(new GridLayout(1,2));
		jp01.add(new JScrollPane(jta_kor));
		jp01.add(new JScrollPane(jta_eng));
		
		
		JButton btn01 = new JButton("변환");
		JButton btn02 = new JButton("취소");	
		
		JPanel jp02 = new JPanel();
		jp02.add(btn01);
		jp02.add(btn02);
		
		add(jp01, BorderLayout.CENTER);
		add(jp02, BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String kor = jta_kor.getText();
				String eng = toEng(kor);
				jta_eng.setText(eng);
			}
		});
		
		btn02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new KorToEngFrame();
	}

}

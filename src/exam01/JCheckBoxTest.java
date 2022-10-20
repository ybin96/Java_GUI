package exam01;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest extends JFrame {
	JCheckBox jcb01; // checkbox 
	JCheckBox jcb02;
	JLabel jlb01;
	
	
	public void pro() { // checkbox 선택하는 케이스를 메소드를 만들어서 정의
		String str = "";
		if(jcb01.isSelected() && jcb02.isSelected()) {
			str = "사과,포도 모두 선택되었습니다";
		}else if (jcb01.isSelected() && !jcb02.isSelected()) {
			str = "사과를 선택하였습니다";
		}else if (!jcb01.isSelected() && jcb02.isSelected()) {
			str = "포도를 선택하였습니다";
		}else {
			str = "아무것도 선택하지 않았습니다";
		}
		jlb01.setText(str); // str을 lable에 출력
	}
	
	public JCheckBoxTest () {
		jcb01 = new JCheckBox("사과");
		jcb02 = new JCheckBox("포도");
		jlb01 = new JLabel("                  ");
		
		setLayout(new FlowLayout());
		add(jcb01);
		add(jcb02);
		add(jlb01);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pro();
				
			}
		});
		
		jcb02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pro();
			}
		});
		
		
	}

	public static void main(String[] args) {
		new JCheckBoxTest();
	}

}

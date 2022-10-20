package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest02 extends JFrame {
	String arr[] = {"사과","포도","수박","오렌지","바나나"}; // 체크박스의 내용을 배열에 담는다
	JCheckBox jcb[] = new JCheckBox[5]; 
	JLabel jlb;
	
	public void pro() {
		boolean flag = false;
		String str = "";
		for(int i=0; i<jcb.length;i++) {
			if(jcb[i].isSelected()) {
				str += jcb[i].getText() +",";
				flag = true;
			}
		}
		if(flag) {
		str = str.substring(0, str.length()-1);
		str += "을 선택하였습니다";
		}else {
			str = "아무것도 선택하지 않았습니다";
		}
		jlb.setText(str);
	}
	
	
	public JCheckBoxTest02() {
		setLayout(new FlowLayout());
		for(int i=0;i<arr.length;i++) {
			jcb[i] = new JCheckBox(arr[i]); // arr배열 하나하나를 jcb배열 하나하나에 담는다 
			add(jcb[i]); // frame에 담는다
			jcb[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pro();
				}
			});
		}
		
		jlb = new JLabel("아무것도 선택하지 않았습니다");
		add(jlb);
		
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest02();

	}

}




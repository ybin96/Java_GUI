package exam02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DeleteFrame extends JFrame {
	JButton btn01;
	JButton btn02;
	public DeleteFrame() {
		setLayout(new FlowLayout()); // 배치(물흐르듯이 동작FlowLayout()
		
		btn01 = new JButton("bus.sist삭제");  
		btn02 = new JButton("circle.sist삭제");
		
		btn01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int re = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠어요?");
				if(re == 0) {
					File file = new File("c:/data/bus.sist");
					file.delete(); // 삭제
					JOptionPane.showMessageDialog(null, "파일을 삭제하였습니다");
				}
			}
		});
		btn02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int re = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠어요?");
				if(re == 0) {
					File file = new File("c:/data/circle.sist");
					file.delete(); // 삭제
					JOptionPane.showMessageDialog(null, "파일을 삭제하였습니다");
				}
			}
		});
		
		add(btn01);
		add(btn02);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeleteFrame();
	}

}

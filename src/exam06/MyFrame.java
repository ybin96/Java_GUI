package exam06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame {
	private LinePanel lp;
	public MyFrame() {
		lp = new LinePanel();
		add(lp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu file = new JMenu("선택");
		JMenuItem file_cir = new JMenuItem("원");
		JMenuItem file_rec = new JMenuItem("사각형");
		JMenuItem file_line = new JMenuItem("선");
		
		file_cir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		file_rec.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		file.add(file_cir);  // 주메뉴에 부메뉴 담기
		file.add(file_rec);
		jmb.add(file); 
		setJMenuBar(jmb);
		
		setSize(400, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}

}

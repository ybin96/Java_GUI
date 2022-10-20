package exam01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {

	private DrawPanel dp;
	JFrame f;
	JFileChooser jfc;

	public MyFrame() {
		f = this;
		jfc = new JFileChooser("c:/data");
		dp = new DrawPanel();
		add(dp);

		JMenuBar jmb = new JMenuBar();
		JMenu draw = new JMenu("그리기 도구");
		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");

		JMenu color = new JMenu("그리기 색상");
		JMenuItem color_red = new JMenuItem("빨강");
		JMenuItem color_green = new JMenuItem("초록");
		JMenuItem color_blue = new JMenuItem("파랑");
		JMenuItem color_black = new JMenuItem("검정");

		JMenu file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		JMenuItem file_exit = new JMenuItem("종료");

		file.add(file_new);
		file.add(file_open);
		file.add(file_save);
		file.add(file_exit);
		draw.add(draw_line);
		draw.add(draw_rect);
		draw.add(draw_oval);
		color.add(color_red);
		color.add(color_green);
		color.add(color_blue);
		color.add(color_black);
		jmb.add(file);
		jmb.add(draw);
		jmb.add(color);
		setJMenuBar(jmb);

		file_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		file_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int re = jfc.showOpenDialog(f);
					if (re == JFileChooser.APPROVE_OPTION) {
						File file = jfc.getSelectedFile();
						ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
						dp.list = (ArrayList<GraphicInfo>) ois.readObject();
						dp.repaint();
					}
				} catch (Exception e2) {
					System.out.println("예외발생:" + e2.getMessage());
				}
			}
		});
		file_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int re = jfc.showSaveDialog(f);// 저장을눌럿는지 취소를 눌럿는지 판단하기위해 변수re를 생성
					if (re == JFileChooser.APPROVE_OPTION) {
						File file = jfc.getSelectedFile();
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(dp.list);
						oos.close();
						JOptionPane.showMessageDialog(null, "저장하였습니다");
					}
				} catch (Exception e2) {
					System.out.println("예외발생:" + e2.getMessage());
				}
			}
		});
		file_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		draw_line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawType = 0; // draw_line이 0이면 라인을 그린다
			}
		});
		draw_rect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawType = 1; // draw_line이 0이면 라인을 그린다
			}
		});
		draw_oval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawType = 2; // draw_line이 0이면 라인을 그린다
			}
		});

		color_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawColor = Color.red;
			}
		});
		color_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawColor = Color.green;
			}
		});
		color_blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawColor = Color.blue;
			}
		});
		color_black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dp.drawColor = Color.black;
			}
		});

		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램 종료
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

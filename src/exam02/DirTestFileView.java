package exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DirTestFileView extends JFrame {
	private JList<String> list;
	private JTextArea jta;

	public DirTestFileView() {
		setLayout(new BorderLayout());

		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta); // 스크롤

		File dir = new File("C:/data");
		String[] data = dir.list();
		list = new JList<String>(data);

		// list에 마우스 이벤트 처리
		list.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("OK");
				String fname = list.getSelectedValue(); // list에 있는걸 선택해서 가져온다
				String str = "";
				try {
					FileReader fr = new FileReader("c:/data/" + fname);
					int ch;
					while ((ch = fr.read()) != -1) {
						str += (char) ch;
					}
					jta.setText(str);
					fr.close();
				} catch (Exception e2) {
					System.out.println("예외발생:" + e2.getMessage());
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JScrollPane jsp_list = new JScrollPane(list);

		JPanel p_center = new JPanel();
		p_center.setLayout(new BorderLayout());

		p_center.add(jsp_list, BorderLayout.WEST); // list를 화면 왼쪽에 설정
		p_center.add(jsp, BorderLayout.CENTER); // 빈화면을 중앙에 설정

		JButton btn_delete = new JButton("파일삭제");

		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int re = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠어요?");
				if (re == 0) {

					String fname = list.getSelectedValue();
					File file = new File("c:/data/" + fname);
					file.delete();
					JOptionPane.showMessageDialog(null, "선택한 파일을 삭제하였습니다");
				}
			}
		});

		add(p_center, BorderLayout.CENTER);
		add(btn_delete, BorderLayout.SOUTH);

		setSize(800, 600);
		setVisible(true); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DirTestFileView();
	}

}

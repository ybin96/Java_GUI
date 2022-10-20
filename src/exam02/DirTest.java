package exam02;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JList;

public class DirTest extends JFrame {
	private JList<String> list;
	public DirTest() {
		File dir = new File("C:/javaTest/day0829");
		String []data = dir.list();
		list = new JList<String>(data);
		add(list);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DirTest();
	}

}

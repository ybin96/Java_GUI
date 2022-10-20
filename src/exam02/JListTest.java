package exam02;

import javax.swing.JFrame;
import javax.swing.JList;

public class JListTest extends JFrame {
	public JListTest() {
		String []data = {"김고운","권현욱","김동민","이명진","이정화"};
		JList<String> list = new JList<String>(data); // list생성
		add(list);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest();

	}
}

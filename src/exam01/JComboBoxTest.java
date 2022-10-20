package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {

	JComboBox<String> jcb;
	Vector<String> data;
	JLabel jlb;
	
	public JComboBoxTest() {
		data = new Vector<String>();
		data.add("사과");
		data.add("포도");
		data.add("수박");
		data.add("바나나");
		data.add("오렌지");
		
		jcb = new JComboBox<String>(data);
		jlb = new JLabel();
		
		setLayout(new BorderLayout());
		add(jcb, BorderLayout.NORTH);
		add(jlb, BorderLayout.CENTER);
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String item = (String) jcb.getSelectedItem(); // 선택한걸 보여준다. combobox가 String이기때문에 변환
				jlb.setText(item);
			}
		});
	}
	
	public static void main(String[] args) {
		new JComboBoxTest();

	}

}

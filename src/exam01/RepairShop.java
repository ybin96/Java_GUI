package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RepairShop extends JFrame {

	String []item = {"엔진 오일 교환","자동 변속기 오일 교환","에어콘 필터 교환","타이어 교환"};
	int []price = {45000,80000,30000,100000};
	JCheckBox []jcb = new JCheckBox[4];
	JLabel jlb;
	
	public void pro() {
		int tot=0;
		for(int i=0;i<jcb.length;i++) {
			if(jcb[i].isSelected()) {
				tot += price[i];
			}
		}
		jlb.setText(tot+"원");
	}
	
	public RepairShop() {
		setLayout(new BorderLayout());
		JPanel p_center = new JPanel();
		JPanel p_down = new JPanel();
		p_center.setLayout(new GridLayout(5,2));
		
		p_center.add(new JLabel("수리"));
		p_center.add(new JLabel("가격(원)"));
		
		for(int i =0;i<item.length;i++) {
			jcb[i] = new JCheckBox(item[i]);
			p_center.add(jcb[i]);
			p_center.add(new JLabel(price[i]+""));
			jcb[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pro();
				}
			});
		}
		
		jlb = new JLabel("                     ");
		p_down.add(new JLabel("총 금액: "));
		p_down.add(jlb);
		add(p_center, BorderLayout.CENTER);
		add(p_down, BorderLayout.SOUTH);
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new RepairShop();
		
	}

}

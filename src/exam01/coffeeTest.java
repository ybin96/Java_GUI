package exam01;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class coffeeTest extends JFrame {

	JRadioButton jrb_s;
	JRadioButton jrb_m;
	JRadioButton jrb_l;
	ButtonGroup bg;
	JPanel j1;
	JPanel j2;
	JPanel j3;
	JPanel j4;
	JLabel jl1;

	
	
	
	
	public coffeeTest() {
		jrb_s = new JRadioButton("Small");
		jrb_m = new JRadioButton("Medium");
		jrb_l = new JRadioButton("Large");
		
		bg = new ButtonGroup();
		bg.add(jrb_s);
		bg.add(jrb_m);
		bg.add(jrb_l);
		
		setLayout(new GridLayout(6,2));
		j1 = new JPanel();
		j1.add(new JLabel("커피크기"));
		j1.add(new JLabel("가격(원)"));
		
		j2 = new JPanel();
		j2.add(jrb_s);
		j2.add(new JLabel("3000"));
		
		j3 = new JPanel();
		j3.add(jrb_m);
		j3.add(new JLabel("4000"));
		
		j4 = new JPanel();
		j4.add(jrb_l);
		j4.add(new JLabel("5000"));
		
		jl1 = new JLabel();
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(jl1);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jrb_s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("3원천입니다.");
				
			}
		});
		
		jrb_m.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("4원천입니다.");
				
			}
		});
		
		jrb_l.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("5원천입니다.");
				
			}
		});
		
	}
	public static void main(String[] args) {
		new coffeeTest();
	}

}

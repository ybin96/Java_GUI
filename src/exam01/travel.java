package exam01;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class travel extends JFrame {

	JRadioButton pairs;
	JRadioButton swiss;
	JRadioButton sw02;
	JRadioButton praha;
	ButtonGroup bg;
	ImageIcon icon_paris;
	ImageIcon icon_swiss;
	ImageIcon icon_sw02;
	ImageIcon icon_praha;
	JPanel jp1;
	JLabel jp2;

	public travel() {
		icon_paris = new ImageIcon("paris.jpg");
		icon_swiss = new ImageIcon("swiss.jpg");
		icon_sw02 = new ImageIcon("sw02.jpg");
		icon_praha = new ImageIcon("praha.jpg");

		pairs = new JRadioButton("파리");
		swiss = new JRadioButton("스위스1");
		sw02 = new JRadioButton("스위스2");
		praha = new JRadioButton("프라하");
		bg = new ButtonGroup();
		bg.add(pairs);
		bg.add(swiss);
		bg.add(sw02);
		bg.add(praha);

		jp1 = new JPanel();
		jp2 = new JLabel(icon_paris);
		jp1.setLayout(new GridLayout(4, 1));
		jp1.add(pairs);
		jp1.add(swiss);
		jp1.add(sw02);
		jp1.add(praha);

		add(jp1, BorderLayout.WEST);
		add(jp2, BorderLayout.CENTER);

		setSize(1400, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pairs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setIcon(icon_paris);

			}
		});
		swiss.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setIcon(icon_swiss);

			}
		});
		sw02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setIcon(icon_sw02);

			}
		});
		praha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setIcon(icon_praha);

			}
		});
	}

	public static void main(String[] args) {
		new travel();

	}

}

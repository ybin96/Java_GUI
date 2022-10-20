package exam01;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinFrame extends JFrame {
	JTextField jtf_name;
	JTextField jtf_addr;
	
	JCheckBox jcb_game;
	JCheckBox jcb_exercise;
	JCheckBox jcb_study;
	JCheckBox jcb_music;
	JCheckBox jcb_movie;
	
	JRadioButton jrb_male;
	JRadioButton jrb_female;
	ButtonGroup bg;
	
	public JoinFrame() {
		setTitle("회원가입");
		setLayout(new GridLayout(5,1));
		jtf_name = new JTextField(10);
		jtf_addr = new JTextField(30);
		
		jcb_game = new JCheckBox("게임");
		jcb_exercise = new JCheckBox("운동");
		jcb_study = new JCheckBox("공부");
		jcb_music = new JCheckBox("음악감상");
		jcb_movie = new JCheckBox("영화감상");
		
		jrb_male = new JRadioButton("남");
		jrb_female = new JRadioButton("여");
		bg = new ButtonGroup();
		bg.add(jrb_male);
		bg.add(jrb_female);
		
		JPanel jp01 = new JPanel();
		jp01.add(new JLabel("이름"));
		jp01.add(jtf_name);
		
		JPanel jp02 = new JPanel();
		jp02.add(new JLabel("성별"));
		jp02.add(jrb_male);
		jp02.add(jrb_female);
		
		JPanel jp03 = new JPanel();
		jp03.add(new JLabel("주소"));
		jp03.add(jtf_addr);
		
		JPanel jp04 = new JPanel();
		jp04.add(new JLabel("관심분야"));
		jp04.add(jcb_game);
		jp04.add(jcb_exercise);
		jp04.add(jcb_study);
		jp04.add(jcb_music);
		jp04.add(jcb_movie);
		
		add(jp01);
		add(jp02);
		add(jp03);
		add(jp04);
		
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new JoinFrame();

	}

}

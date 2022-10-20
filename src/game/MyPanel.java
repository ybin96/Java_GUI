package game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {

	Enermy enermy;
	Misile misile;
	SpaceShip spaceShip;
	
	public MyPanel() {
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enermy =new Enermy("enermy.png");
		misile = new Misile("misile.png");
		spaceShip = new SpaceShip("player.png");
		
		new Thread() {
			public void run() {
				while(true) {
					enermy.update();
					spaceShip.update();
					misile.update();
					//if(enermy.x == misile.x) {
					//	enermy.y = -1000;
					//}
					repaint();
					try {
						Thread.sleep(50);
					}catch (Exception e) {
						// TODO: handle exception
					}					
				}
			}
		}.start();
		
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		enermy.draw(g);
		spaceShip.draw(g);
		misile.draw(g);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키 눌러지");
		// TODO Auto-generated method stub
		spaceShip.keyPressed(e);
		misile.keyPressed(e, spaceShip.x, spaceShip.y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

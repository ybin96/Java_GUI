package exam06;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ManPanel extends JPanel {
	BufferedImage img;
	private int x =10;
	
	public ManPanel() {
		try {
			img = ImageIO.read(new File("man.png"));
		}catch(Exception e) {
			System.out.println("예외발생 :"+e.getMessage());
		}
		
		new Thread() {
			@Override
			public void run() {
				while(true) {
					x+=10;
					repaint(); // 다시 그려주세요
					try {
						Thread.sleep(100);
					}catch(Exception e) {
					}
				}
			}
		}.start();
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("동작함");
		g.drawImage(img, x, 100, null);
		
	}
}

package game;

import java.awt.event.KeyEvent;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class SpaceShip extends GraphicObject {
	public SpaceShip(String name) {
		super(name);
		x = 150;
		y = 350;
	}
	
	public void keyPressed(KeyEvent event) {
		
		
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			x-= 10;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}
	
}

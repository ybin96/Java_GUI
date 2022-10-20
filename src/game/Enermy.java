package game;

import java.util.Random;

public class Enermy extends GraphicObject {
	int dx = -10;
	
	public Enermy(String name) {
		super(name);
		x = 500;
		y = 0;	
	}
	
	public void  update() {
		x += dx;
		Random n = new Random();
		int a = n.nextInt(50);

		if(x < 0) {
			dx = +a;
		}
		if(x > 500) {
			dx = -a;
		}
	}
}

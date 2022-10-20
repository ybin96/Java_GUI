package exam04;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.function.IntFunction;

import javax.swing.JPanel;



public class LinePanel extends JPanel implements MouseListener{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	ArrayList<GraphicInfo> list;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for(int i =0;i<list.size();i++) {
			GraphicInfo info = list.get(i); // list에 있는걸 하나씩 꺼내온다
			g.drawLine(info.getX1(),info.getY1(),info.getX2(),info.getY2());
		}
	}
	
	public LinePanel() {
		addMouseListener(this); // 마우스 이번트를 처리하는 객체가 this=자신이다
		list = new ArrayList<GraphicInfo>();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX(); // 마우스가 눌러진 x좌표를 가져온다 == get.X();
		y1 = e.getY(); // 마우스가 눌러진 y좌표를 가져온다 == get.Y();
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		list.add(new GraphicInfo(x1, y1, x2, y2));
		repaint(); // 다시 그려달라는 수식
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}





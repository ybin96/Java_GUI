package exam01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener{
	private int x1,y1,x2,y2;
	int drawType;
	int colorType;
	Color drawColor;
	
	ArrayList<GraphicInfo> list;
	
	public DrawPanel() {
		list = new ArrayList<GraphicInfo>(); // list 생성
		drawColor = Color.red; // 색상 나타내기
		addMouseListener(this); // 마우스 event발생
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for (int i =0;i<list.size();i++) {
			GraphicInfo info = list.get(i);
			int x = info.getX1();
			int y = info.getY1();
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			// 역방향에 대해 정의해주는 수식
			if(info.getX1() > info.getX2()) {
				x = info.getX2();
				width = info.getX1() - info.getX2();
			}
			if(info.getY1() > info.getY2()) {
				y = info.getY2();
				height = info.getY1() - info.getY2();
			}
			g.setColor(info.getDrawColor());
			switch(info.getDrawType()) {
			case 0 : g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());break;
			case 1 : g.drawRect(x, y, width, height);break;
			case 2 : g.drawOval(x, y, width, height);break;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		
		//클릭을 마쳤을떄 list에 GraphicInfo정보를 담는다
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

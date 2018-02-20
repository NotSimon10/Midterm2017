import java.awt.Graphics;

public class Circle extends Shape {

	public void draw(Graphics g) {

		g.drawOval(100, 250, 100, 100);

	}

	public void sides(Graphics g) {

		g.drawString("Circles have 0 sides.", 80, 240);

	}

}

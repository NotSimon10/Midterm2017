import java.awt.Graphics;

public class Square extends Shape {

	public void draw(Graphics g) {

		g.drawRect(100, 100, 100, 100);

	}

	public void sides(Graphics g) {

		g.drawString("Squares have 4 sides.", 80, 90);

	}

}

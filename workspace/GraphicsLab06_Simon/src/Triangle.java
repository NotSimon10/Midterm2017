import java.awt.Graphics;

public class Triangle extends Shape {

	public void draw(Graphics g) {

		g.drawPolygon(new int[] { 300, 400, 350 }, new int[] { 200, 200, 100 },
				3);

	}

	public void sides(Graphics g) {

		g.drawString("Triangles have 3 sides.", 280, 90);

	}

}

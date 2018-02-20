import java.awt.Graphics;

public class Octagon extends Shape {

	public void draw(Graphics g) {

		g.drawPolygon(new int[] { 225, 250, 275, 275, 250, 225, 200, 200 },
				new int[] { 240, 240, 215, 195, 195, 215, 240, 240 }, 8);

	}

	public void sides(Graphics g) {

	}

}

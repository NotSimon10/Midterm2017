import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class GraphicsLab06_Simon extends Applet {

	public void paint(Graphics g) {

		ArrayList<Shape> shape = new ArrayList<Shape>();

		shape.add(new Square());
		shape.add(new Triangle());
		shape.add(new Circle());
		shape.add(new Octagon());

		for (Shape shap : shape) {

			shap.draw(g);
			shap.sides(g);

		}
	}

}

import java.applet.Applet;
import java.awt.Graphics;

public class JavaComposition_Simon extends Applet {

	public void paint(Graphics g) {

		Head head = new Head(g);
		Face face = new Face(g);

	}
}

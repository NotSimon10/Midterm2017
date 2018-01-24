import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Face extends Applet {

	public Face(Graphics g) {

		g.setColor(Color.black);
		g.fillOval(60, 50, 50, 80);
		g.fillOval(190, 50, 50, 80);

		g.setColor(Color.white);
		g.fillOval(70, 60, 20, 32);
		g.fillOval(200, 60, 20, 32);

	}

}

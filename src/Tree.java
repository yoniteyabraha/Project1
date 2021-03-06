import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>
 * Create a tree with ornaments in a graphics window
 * </p>
 * 
 * @author YonasAbraha
 */

public class Tree {

	// Instance fields
	// The graphics window this tree belongs to
	private GWindow window;
	// The location of this tree
	// (precisely (as done in the draw method), (x,y) is
	// the upper left corner of the tree trunk)
	private int x;
	private int y;
	// The scale used to draw this tree
	private double scale;

	/**
	 * Create a tree
	 * 
	 * @param x      the x coordinate of the tree location (upper left corner of the
	 *               tree trunk)
	 * @param y      the y coordinate of the tree location
	 * @param window the graphics window this Tree belongs to
	 * @param scale  the scale of the drawing (all default dimensions are multiplied
	 *               by scale)
	 */
	public Tree(int x, int y, double scale, GWindow window) {
		// Initialize the instance fields (the use of this. is required
		// since the instance fields have the same name as the
		// parameters of the constructor)
		this.window = window;
		this.scale = scale;
		this.x = x;
		this.y = y;

		// the details of the drawing are in written in the private method draw()
		this.draw();
	}

	/**
	 * draw a pine tree
	 */
	private void draw() {
		// trunk of the tree: a brown rectangle
		// (int) converts to an int 20*this scale (etc...), which is a double
		// For instance, (int)23.8 is 23
		// This is necessary since the Rectangle constructor takes integers
		Rectangle trunk = new Rectangle(this.x, this.y, (int) (20 * this.scale), (int) (60 * this.scale), Color.black,
				true);
		// Foliage (improve the drawing!)
		// a green triangle
		Triangle foliage = new Triangle(this.x - (int) (30 * this.scale), this.y + (int) (30 * this.scale),
				this.x + (int) (10 * this.scale), this.y - (int) (10 * this.scale), this.x + (int) (50 * this.scale),
				this.y + (int) (30 * this.scale), Color.green, true);
		this.window.add(trunk);
		this.window.add(foliage);
		// Improve the drawing of the foliage and add the ornaments...

		Triangle foliage2 = new Triangle(this.x - (int) (30 * this.scale), this.y + (int) (30 * this.scale),
				this.x + (int) (10 * this.scale), this.y - (int) (10 * this.scale), this.x + (int) (50 * this.scale),
				this.y + (int) (30 * this.scale), Color.green, true);
		foliage2.moveBy(0, -(int) (10 * scale));
		this.window.add(foliage2);

		Triangle foliage3 = new Triangle(this.x - (int) (30 * this.scale), this.y + (int) (30 * this.scale),
				this.x + (int) (50 * this.scale), this.y + (int) (30 * this.scale), this.x + (int) (10 * this.scale),
				this.y - (int) (10 * this.scale), Color.green, true);
		foliage3.moveBy(0, -(int) (20 * scale));
		this.window.add(foliage3);

		Oval ornament1 = new Oval(this.x + (int) (45 * this.scale), this.y + (int) (25 * this.scale),
				(int) (6.0 * scale), (int) (6.0 * scale), Color.BLUE, true);
		this.window.add(ornament1);
		Oval ornament2 = new Oval(this.x, this.y, (int) (6.0 * scale), (int) (6.0 * scale), Color.RED, true);
		this.window.add(ornament2);
		Oval ornament3 = new Oval(this.x - (int) (30 * this.scale), this.y + (int) (26 * this.scale),
				(int) (6.0 * scale), (int) (6.0 * scale), Color.YELLOW, true);
		this.window.add(ornament3);
		Oval ornament4 = new Oval(this.x + (int) (7 * this.scale), this.y - (int) (30 * this.scale),
				(int) (6.0 * scale), (int) (6.0 * scale), Color.MAGENTA, true);
		this.window.add(ornament4);

	}
}
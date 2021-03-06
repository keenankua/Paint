package paint;

import java.awt.Graphics2D;
/**
 * A Square is a type of Rectangle, which is a type of Shape. The height and the width of a Square will be same.
 *
 *
 */
public class Square extends Rectangle{
	private int side;

	
	/**
	 * Creates a new Square with given origin, colour and stroke
	 * @param origin the Starting Point of the Square
	 */
	public Square(Point origin){
		super(origin);
	}
	
	/**
	 * Sets the width and the height of the Square to the given side length
	 * @param side
	 */
	public void setSide(int side) {
		super.setHeight(side);
		super.setWidth(side);
	}
	
	/**
	 * Draw the Square by executing the code below.
	 * Square has its own implementation of draw as it is drawn differently from other Shapes.
	 */
	@Override
	public void execute(Graphics2D g2d){
		int side = this.getHeight();
		int x,y;
		
		//Cases for where the top left coordinates of the square will start based on if the user is trying to drag to the right or left and up or down
		if (this.getOrigin().getX() < this.getEnd().getX()) {
			x = this.getOrigin().getX();
		}
		else {
			x = this.getOrigin().getX() - this.getHeight();
		}
		if (this.getOrigin().getY() < this.getEnd().getY()) {
			y = this.getOrigin().getY();
		}
		else {
			y = this.getOrigin().getY() - this.getHeight();
		}
		if (this.getIsFilled()){
			g2d.drawRect(x, y, side, side);
		}
		else{
			g2d.fillRect(x, y, side, side);
		}
	}

}
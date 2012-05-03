import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class TriData extends ObjectData {

	int Tresize;
	Polygon sensor;
	
	TriData(int height, int width) {
		super (height, width);
		this.Tresize = rand.nextInt(width/6);
		this.setRandomColor();
		
	}

	@Override
	public void draw(Graphics g) {
		int [] xpos = {x, x+(Tresize/2) , x+Tresize }; 
		int [] ypos = {y, y+(Tresize), y};
		this.sensor = new Polygon(xpos, ypos, 3);
		g.setColor(this.color);
		g.fillPolygon(xpos, ypos, 3);
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getVelY() {
		return this.velY;
	}

	@Override
	public int getVelX() {
		return this.velX;
	}

	@Override
	public int getHeight() {
		return this.Tresize;
	}

	@Override
	public int getWidth() {
		return this.Tresize;
	}

	@Override
	public void setVelY(int y) {
		this.velY = y;
		
	}

	@Override
	public void setVelX(int x) {
		this.velX = x;
	}

	@Override
	public void setY(int y) {
		this.y = y;
		
	}

	@Override
	public void setX(int x) {
		this.x = x;
		
	}

	@Override
	public boolean isHit(int x, int y) {
		return this.sensor.contains(x, y);
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}

	@Override
	public int getSize() {
		return Tresize;
	}
}

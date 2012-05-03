import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class OvalData extends ObjectData {
	int ovalsize;
	Rectangle sensor = new Rectangle();
	
	
	OvalData(int width, int height) {
		super(width, height);
		this.setRandomColor();
		this.ovalsize = rand.nextInt(width/6);
		this.x = rand.nextInt(this.width-this.ovalsize);
		this.y = rand.nextInt(this.height-this.ovalsize);
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(this.color);
		g.fillOval(this.x, this.y, ovalsize, ovalsize);
		sensor.setBounds(this.x, this.y, ovalsize, ovalsize);
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
		return this.ovalsize;
	}

	@Override
	public int getWidth() {
		return this.ovalsize;
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
	
	public int getSize(){
		return this.ovalsize;
	}
	
}

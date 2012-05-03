import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;



public abstract class ObjectData {
	
	int velX, velY;
	int x, y, height, width;
	Color color;
	Random rand = new Random();

	/**
	 * 
	 * @param	x		X-cordinate for the object
	 * @param	y		Y-cordinate for the object
	 * @param	velX	Velocity in x direction
	 * @param	velY	Velocity in Y direction
	 * @param	height	Height of the object
	 * @param	width	Width of the object
	 */
	ObjectData(int width, int height){
		
	
		this.velX = 3;
		this.velY = 3;
		this.height = height;
		this.width = width;
		
		setRandomColor();
	}
	
	abstract public void draw(Graphics g);
	
	
	public void setRandomColor(){
		Color[] randColor = {Color.BLUE, Color.GREEN, Color.CYAN, Color.GRAY, Color.MAGENTA};

		this.color = randColor[rand.nextInt(randColor.length)];
	}
	
	abstract public int getY();
	
	abstract public void setY(int y);
	
	abstract public int getX();
	
	abstract public void setX(int x);
	
	abstract public int getVelY();
	
	abstract public void setVelY(int y);
	
	abstract public int getVelX();
	
	abstract public void setVelX(int x);
	
	abstract public int getHeight();
	
	abstract public int getWidth();
	
	abstract public boolean isHit(int x, int y);
	
	abstract public void setColor(Color color);
	
	abstract public int getSize();
	
	
}
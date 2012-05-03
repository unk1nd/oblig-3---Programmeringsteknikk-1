
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.Timer;



@SuppressWarnings("serial")
public class PlayPanel extends Main implements ActionListener, MouseListener{
	
	Timer t = new Timer(9, this);
	ArrayList <ObjectData> shapes = new ArrayList<ObjectData>();
	public int selID = -1;
	
	PlayPanel(){
		this.setBackground(Color.BLACK);
		addMouseListener(this);
	}
	
	
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		for(int i = 0; i < shapes.size(); i++){
			shapes.get(i).draw(g);
		}
		
		repaint();
		t.start();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i = 0; i < shapes.size(); i++){
			
			if(shapes.get(i).getX() < 0 || shapes.get(i).getX() > (this.getWidth() - shapes.get(i).getWidth())){
				shapes.get(i).setVelX(-shapes.get(i).getVelX());
			}
			
			if(shapes.get(i).getY() < 0 || shapes.get(i).getY() > (this.getHeight() - shapes.get(i).getHeight())){
				shapes.get(i).setVelY(-shapes.get(i).getVelY());
			}
			
			
			shapes.get(i).setX((shapes.get(i).getX()+shapes.get(i).getVelX()));
			shapes.get(i).setY((shapes.get(i).getY()+shapes.get(i).getVelY()));
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		clickcheck:
		for(int i = 0; i<shapes.size(); i++){
			
 		   if (shapes.get(i).isHit(e.getX(), e.getY()) == true)
 		   {
 			   menu.setColor.setEnabled(true);
 			   menu.isMoving.setEnabled(true);
 			   
 			   selID = i;
 			   
 			  if(main.shapes.get(selID).getVelX() > 0){
 				  System.out.println("BEVEGELSE");
					menu.setSpeed.setEnabled(true);
					menu.isMoving.setSelected(true); 
				}
 			  else if(main.shapes.get(selID).getVelX() == 0) {
 				  System.out.println(main.shapes.get(selID).velX);
					menu.isMoving.setSelected(false);
				}
 			   
 			   
 			   System.out.println(selID + " er valgt..");
 			   
 			break clickcheck;   
 		   }
 		   else {
 			  selID = -1;
 			  
 			  if(selID == -1)
 			  { 				  
 				  menu.setColor.setEnabled(false);
 				  menu.isMoving.setEnabled(false);
 				  
 			  }
 		   }
 	   }
 	   
 	   //
 	   
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

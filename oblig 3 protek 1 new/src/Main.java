import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Main extends JPanel{
		
	static PlayPanel main = new PlayPanel(); 
	static MenuPanel menu = new MenuPanel();
	int newWidht = this.getWidth();
	int newHeight = this.getHeight();
	
	public static void main (String[] args) {
		
		final int FRAMEWIDTH = 1080;
		final int FRAMEHEIGHT = 720;
		
		
		JFrame frame = new JFrame ("The Frame");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		
		frame.setLayout(new BorderLayout());
		frame.setPreferredSize(new Dimension(FRAMEWIDTH, FRAMEHEIGHT));	
		frame.getContentPane().add(main, BorderLayout.CENTER);
		frame.getContentPane().add(menu, BorderLayout.SOUTH);
		frame.setMinimumSize(new Dimension(640,720));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	public class drawNEWoval implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   if(main.shapes.size() <= 20){
    		   menu.clear.setEnabled(true);
    	   main.shapes.add(new OvalData(main.getWidth() ,main.getHeight() ) );
    	   }
    	   else
    		   System.out.println("Ikke plass til flere i array.");
    	   
       }
    }
	
	public class drawNEWfirkant implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   if(main.shapes.size() <= 20){
    		   menu.clear.setEnabled(true);
    	   main.shapes.add(new RectData(main.getWidth() ,main.getHeight() ) );
    	   }
    	   else
    		   System.out.println("Ikke plass til flere i array.");
    	   
       }
    }
	
	public class drawNEWtrekant implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   if(main.shapes.size() <= 20){
    		   menu.clear.setEnabled(true);
    	   main.shapes.add(new TriData(main.getWidth() ,main.getHeight() ) );
    	   }
    	   else
    		   System.out.println("Ikke plass til flere i array.");
    	   
       }
    }
	
	public class cleararray implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   main.shapes.clear(); 
    	   menu.setColor.setEnabled(false);
    	   System.out.println("Array Cleared..");
    	   menu.setSpeed.setEnabled(false);
    	   menu.isMoving.setEnabled(false);
    	   menu.clear.setEnabled(false);
    	   
       }
    }
	
	public class velgfarge implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   Color newColor = JColorChooser.showDialog(null, "Velg farge", null);
    	   main.shapes.get(main.selID).setColor(newColor);
    	   System.out.println("Farge pŒ " + main.selID + " har byttet farge til " + newColor );
    	   
       }
    }
	
	public class exitprogram implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   System.exit(0);
    	   
       }
    }
	
	
}

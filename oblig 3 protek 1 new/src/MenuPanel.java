import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;





@SuppressWarnings("serial")
public class MenuPanel extends Main  {
		
	JButton setColor = new JButton("Farge");
	JCheckBox isMoving = new JCheckBox("Bevegelse");
	JSlider setSpeed = new JSlider(1, 5);
	JButton clear = new JButton("Fjern alle");
	
	MenuPanel(){
		
		this.setBackground(Color.DARK_GRAY);
		this.setPreferredSize(new Dimension(0, 100));
		this.setBounds(0, 0, 1, 100);
		this.setLayout(null);
		
		
		JButton addOval = new JButton("Ny oval");
		JButton addFirkant = new JButton("Ny Firkant");
		JButton addTrekant = new JButton("Ny Trekant");
		JButton quit = new JButton("Quit");
		
			
		setColor.setEnabled(false);
		isMoving.setEnabled(false);
		setSpeed.setEnabled(false);
		clear.setEnabled(false);
		
		setSpeed.addChangeListener(new ChangeListener() {  
	           
	         public void stateChanged(ChangeEvent evt) {  
	             JSlider setSpeed = (JSlider)evt.getSource();  
	       
	             if (!setSpeed.getValueIsAdjusting()) {  
 
	                 int value = setSpeed.getValue();
	                 main.shapes.get(main.selID).setVelX(value);
	                 main.shapes.get(main.selID).setVelY(value);
	                 System.out.println("Slider verdi: " + value);  
	             }  
	         }  
	     });
		
		isMoving.addChangeListener(new ChangeListener(){
			
			public void stateChanged(ChangeEvent evt) {
				
				
				if(isMoving.isEnabled() == true && main.selID >= 0){
					if(isMoving.isSelected() == false)
					{
						setSpeed.setEnabled(false);
						main.shapes.get(main.selID).setVelX(0);
						main.shapes.get(main.selID).setVelY(0);
					}
					if(isMoving.isSelected() == true)
					{
						setSpeed.setEnabled(true);
						main.shapes.get(main.selID).setVelX(3);
						main.shapes.get(main.selID).setVelY(3);
					}	
				}
			}
		});

		addOval.addActionListener(new Main.drawNEWoval());
		addFirkant.addActionListener(new Main.drawNEWfirkant());
		addTrekant.addActionListener(new Main.drawNEWtrekant());
		clear.addActionListener(new Main.cleararray());
		setColor.addActionListener(new Main.velgfarge());
		quit.addActionListener(new Main.exitprogram());
		
		
		
		addOval.setBounds(10, 20, 100, 60);
		addFirkant.setBounds(120, 20, 100, 60);
		addTrekant.setBounds(230, 20, 100, 60);
		
		isMoving.setBounds(400, 20, 100, 30);
		setSpeed.setBounds(400, 50, 100, 30);

		setColor.setBounds(510, 20, 100, 60);
		clear.setBounds(620, 20, 100, 60);
		quit.setBounds(730,20,100, 60);
		
		add(addOval);
		add(addFirkant);
		add(addTrekant);
		add(isMoving);
		add(setColor);
		add(setSpeed);
		add(clear);
		add(quit);
		
	}
	
	
	
}

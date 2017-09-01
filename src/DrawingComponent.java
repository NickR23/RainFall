import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class DrawingComponent extends JPanel implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = -146592380106024634L;
	//^^^^^^^^^^Sets the serial for this class^^^^^^^^^
	
	//Initializes the world timer
	Timer worldT = new Timer (5,this);
	
	//Sets the number of RainDrop objects generated
	int numOfDrops = 200;
    //Makes an array of RainDrop objects
    RainDrop[] Drops = new RainDrop[numOfDrops];


    public void clockStart(){
        //Also init all the drops
        for(int i=0; i<numOfDrops ; i++){
            Drops[i] = new RainDrop();
        }
        
        worldT.start();
        System.out.println("Object clocks initialized :)");
    }
    
    
	//Loads these images in as a BufferedImage class when called
	BufferedImage raindrop,backdrop,ball;
	
    public void imageLoad () throws IOException{
    File file = new File("backdrop.jpg");
    backdrop = ImageIO.read(file);
    File file1 = new File("raindrop1.png");
    raindrop = ImageIO.read(file1);
    File file2 = new File("ball.png");
    ball = ImageIO.read(file2);
    }
    
    //Paints to the JPanel
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;    
        
        //Runs the function to load in the images
        try {
           imageLoad();
        }   catch (IOException e) {
            System.out.println("Image failed to load");
        } 
        
        setBackground(Color.BLACK);
        Rectangle rect1 = new Rectangle(20,20,50,50);
        g2d.draw(rect1);
        g2d.drawImage(backdrop,0,0,null);
      
        //Draws all the raindrops!
        for(int c = 0; c<numOfDrops; c++) {
        		g2d.drawImage(raindrop,Drops[c].getX(),Drops[c].getY(),null);
        }
        g2d.drawImage(ball,70,400,null);
    }
	
    public void actionPerformed(ActionEvent e){
        for(int j = 0; j<numOfDrops; j++) {
    			Drops[j].updateLoc();
        }
        repaint();
    }
    

}

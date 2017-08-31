import javax.swing.JFrame;


public class RainFall {
	public static void main(String args[]) {
		System.out.println("Hello");
        JFrame win = new JFrame("RainFall...");
        
        DrawingComponent DC = new DrawingComponent();
        DC.clockStart();
        win.add(DC);
  
        win.setSize(922,690);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
	}
}

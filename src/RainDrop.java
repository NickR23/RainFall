import java.util.Random;


public class RainDrop{
	
	//Gives a random horizontal location for the rain drop and velocity
	Random randx = new Random();
	Random randv = new Random();
	//Sets the location vars for the objects on screen
	int rainx = randx.nextInt(1100) + 50 , rainy = 0, vely = randv.nextInt(10) + 9;
	 public int getX() {
		 return rainx;
	 }
	 public int getY() {
		 return rainy;
	 }
	 
	 //Initializes the RainDrop object
	 //Also starts the internal clocks for each raindrop
	 
	 public void updateLoc() {
		 if(rainy >= 690) {
				Random randx = new Random();
				Random randv = new Random();
			 rainy = 0;
			 rainx = randx.nextInt(922) + 10;
			 vely = randv.nextInt(10) + 9;
			 System.out.println("RainDrop vel = " + vely);
		 }
		 rainy += vely;
	 }
}
	 


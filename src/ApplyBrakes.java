
public class ApplyBrakes {
	static boolean isMoving;
	static int currentSpeed;
	static int speed;
	static int total;
	static int totalDistance;
	public static void main(String[] args) {
		currentSpeed= 15;
		speed=10;
		applyBrakes();
		applyBrakes();
		start();
		move();
		totalDistance(15,10);
	}
	public static void applyBrakes()
	{
		if(isMoving){
			currentSpeed--;
		}
		else {
			System.out.println("The bicycle speed's reducing");
		}
	}
	public static void applyBrakes(int speed)
	{
		if(isMoving){
			currentSpeed--;
		}else {
			System.out.println("The bicycle has already stopped!");
		}
	}
	public static void start(){
		int twicespeed = currentSpeed *2;
		System.out.println("The twice speed is "+ twicespeed);
	}
	public static void move()
	{
		 total = currentSpeed * speed; 
		System.out.println("The total speed " + total);
	}
	public static void totalDistance(int x, int y){
		totalDistance = x + y;
		System.out.println("The totalDistance is " + totalDistance);
	}
}

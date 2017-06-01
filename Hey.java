
public class Hey {

	public static void main(String[] args) {
		
		System.out.println("Hey");

		Car c1 = new Car();

		c1.accelerate();
		c1.brake();
		c1.steer();
	}
	
}

class Car
{

	void accelerate()
	{
		System.out.println("accelerate");
	}

	void brake()
	{
		System.out.println("brake");
	}

	void steer()
	{
		System.out.println("steer");
	}
}
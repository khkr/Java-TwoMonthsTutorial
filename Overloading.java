public class Overloading
{
	public static void main(String[] args)
	 {
	 	Area a1 = new Area();

	 	a1.method1(7);
	 	a1.method1(30,40);
	}
}

class Area
{
	void method1(int radius)
	{
		System.out.println(22*radius*radius/7);
	}

	void method1(int length,int breadth)
	{
		System.out.println(length*breadth);
	}

}
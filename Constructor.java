public class Constructor
{
	public static void main(String[] args) {

		int radius = 20;
		Area a1 = new Area();
	}

}

class Area
{ 
	Area()
	{
		System.out.println("An object is created");
	}
	Area(int radius)
	{
		System.out.println(22*radius*radius/7);
	}
}
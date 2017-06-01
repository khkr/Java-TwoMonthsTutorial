class Parent
{
	void method1()
	{
		System.out.println("This is Parent class");
	}
}

class Child extends Parent
{
	void method2()
	{
		System.out.println("This is Child class");
	}
}

public class Inheritance 
{
	public static void main(String args[])
	{
		Child c1  = new Child();

		Parent p1 = new Parent();

		c1.method1();
		c1.method2();
		//p1.method2();

	}

}
class A
{
	int a=20,b=24,c=33;

	void method1()
	{
		System.out.println("This is so cool");
	}
}
class B extends A
{
	int a= 100;
	int b=200;
	int c=300;

	//The following method declaration is called polymorphism

	void method1()
	{
		System.out.println("I know right");
	}
}
public class NewInheritance{
public static void main(String[] args) {
	A a1 = new A();
	B b1 = new B();
	a1.method1();
	b1.method1();
	}


}
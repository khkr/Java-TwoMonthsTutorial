public class St
{
	public static void main(String[] args) {

		Student s1 = new Student("Naresh",744,89.6);

		System.out.println("The marks are:"+s1.getmarks());



		
	}
}

private class Student
{
	String name1;
	private int marks1;
	double percentage1;
	//Constructor
	public Student(String name,int marks,double percentage)
	{
		name1 = name;
		marks1 = marks;
		percentage1 = percentage;
	}

	public int getmarks()
	{
		return marks1;
	}

}

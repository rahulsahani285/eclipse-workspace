
class Parent
{
	public void add(int a, int b)
	{
		System.out.println("This is parents add");
	}
	Parent(double a,double b)
	{
		System.out.println("This is parents sub");
	}
	public void add(int a, double c)
	{
		System.out.println("This is parents overloaded add");
	}
}
class Child extends Parent
{
	Child(){
	super(1.2,34);
	}
	Child(int a,int b)
	{
		this();
		System.out.println("Child class constructor");
	}
	public void add(int c, int b)
	{
		
		System.out.println("This is child add overridded");
	}
	
}


public class SuperAndThisKeyword {
	
	public static void main(String[] args) {
		
Parent obj=new Child();
obj.add(2, 2);
 
	}

}

package JavaBasics;

 public class first {

	 first()
	 {
		 System.out.println("Parent class constructor");
	 }
	 first(int a)
	 {
		 System.out.println(a);
	 }

}
 
class second extends first
{
	private int j;
	second(int j)
	{
		this();
		this.j=j;
		System.out.println("Second class constructor and "+j);
		
	}
	public second() {
		super(60);
		System.out.println("This is contractshj");
	}
}


class third 
{
public static void main(String[] args) {
		
	new second(20);
	
	
	}
}

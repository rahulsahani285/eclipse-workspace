package test13;

public class recursion {
	public static int test(int i)
	{
		if(i!=0)
		{
			return i+ test(i-1);
		}
		else
		{
			return i;
		}
	}

public static void main()
{
	System.out.println(test(5));
}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class jp {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			l.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			l.add(String.valueOf(i));
		}
		
	//ListD(l);
	String[] a= {"r","a","h","u","l"};
	//sortArray(a);
	//invertInteger();
	
	int [] i={1,2,3,4,5,6,7};
	convertIntToString(i);
	}
	
	public static void ListD(List<String> haha)
	{
		Set<String> set1=new HashSet<String>();
		
		
		for(String ss:haha)
		{
			if(!set1.add(ss))
			{
				System.out.println(ss);
			}
			
		}
		System.out.println(set1);
		
	}

	public static void sortArray(String[] arr)
	{
		Arrays.sort(arr);
		for(String s:arr)
		System.out.println(s);
	}

public static void invertInteger()
{
	int i=12345;
	int temp=0;
	
	while(i>0) {
	
	temp=(temp*10)+ i%10;
	i=i/10;
	}
	
	System.out.println("Inverted integer is: "+ temp);
	
	
}

public static void convertIntToString(int[] arr )
{
	List<String> lst=new ArrayList<String>();
	for(int a: arr)
	{
		lst.add(String.valueOf(a));
	}
	lst.stream().forEach(x-> System.out.println(x));
}
}

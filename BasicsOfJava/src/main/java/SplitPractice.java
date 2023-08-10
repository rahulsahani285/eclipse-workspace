import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SplitPractice {
	
	/*public static int GetOccurance(String str, String ch)
	{
	 int count=0;
		String[] ch2= str.split("");
		for(String c:ch2)
		{
			if(ch.equalsIgnoreCase(c))
			{
				count++;
			}
		}
		return count;
	}  */
	

	public static void main(String[] args) {
		
		
		//System.out.println(GetOccurance("Rahulhahaharrrrnishar","r"));
		String s="Thisz is the world which is not so kind but also the kindness doesnt defines it";
		
		Set<String> set=new LinkedHashSet<String>();
		
		String arr[]= s.split("");
		List<String> list= Arrays.asList(arr);
		for(String a:list)
		{
			set.add(a);
		}
		set.remove(" ");
		for(String a:set)
		{
			System.out.println(a);
		}
	
		
	
	}

}

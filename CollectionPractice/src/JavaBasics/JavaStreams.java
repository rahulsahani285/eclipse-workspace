package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaStreams {

	public static void main(String[] args) {
		String[] arr= {"Rahul","Ankit","Mahesh","Kavit","anamika","vaishnavee","hjkknsdl"};
		List<String> a= Arrays.asList(arr);
		
        a.stream().map(s->s.concat("This element is concatinated")).forEach(s->System.out.println(s));
       Stream.of("1","2","3","4","5","6","7","8").filter(z->z.matches("1")).map(z->z.concat("Hello")).forEach(x->System.out.println(x));
        
        Stream.of(arr).forEach(x->System.out.println(x));
        
        //Map function
        Stream.of("Henna", "Devang","Reena","URmila","Pooja","Priya").map(x->x.toUpperCase()).forEach(x->System.out.println(x));
        
        
        
	}

}

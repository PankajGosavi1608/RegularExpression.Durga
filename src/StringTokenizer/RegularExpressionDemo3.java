package StringTokenizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo3 {

	
	public static void main(String[] args) 
	{
	//Pattern p=Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
	Pattern p=Pattern.compile("[7-9][0-9][0-9][0-9][0-9]");
	Matcher m=p.matcher(args[0]);
	if(m.find()&&m.group().equals(args[0]))
	{
	System.out.println("valid number");
	}
	else
	{
		System.out.println("invalid number");
		}
		}
		
//		Analysis:
//		10 digits mobile:
//		[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9] (or)
//		[7-9][0-9]{9}

}

package BasicOfRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
	
	public static void main(String[] args) 
	{
		
    System.out.println("Output will be blank");
	Pattern p=Pattern.compile("x");
	Matcher m=p.matcher("a1b7 @z#");
	while(m.find())
	{
	System.out.println(m.start()+"-------"+m.group());
	
	}
	}
	}




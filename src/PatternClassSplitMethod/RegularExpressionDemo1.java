package PatternClassSplitMethod;

import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
	
	public static void main(String[] args) 
	{
	Pattern p=Pattern.compile("\\."); //(or)[.]
	String[] s=p.split("www.BikkadIt.com");
	for(String s1:s)
	{
	System.out.println(s1);//www
	//BikkadIT
	//com
	}
	}
	}
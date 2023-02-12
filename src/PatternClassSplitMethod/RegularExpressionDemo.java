package PatternClassSplitMethod;

import java.util.regex.Pattern;

public class RegularExpressionDemo {
	
	public static void main(String[] args) 
	{
	Pattern p=Pattern.compile("\\s");
	String[] s=p.split("Pankaj Senior Soft Developer");
	
	for(String s1:s)
	{
	System.out.println(s1);//Pankaj
	
	}
	}
	}


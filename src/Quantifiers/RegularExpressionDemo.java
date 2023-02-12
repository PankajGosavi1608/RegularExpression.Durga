package Quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	
	public static void main(String[] args) 
	{
	Pattern p=Pattern.compile("x");
	Matcher m=p.matcher("abaabaaab");
	while(m.find())
		
	{
		System.out.println(m.start()+"-------"+m.group());
		
		}
		}
		}





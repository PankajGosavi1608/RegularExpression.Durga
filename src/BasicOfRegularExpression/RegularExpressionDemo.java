package BasicOfRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	
	public static void main(String[] args) 
	{
	int count=0;
	
	//pattern class
	Pattern p=Pattern.compile("ab");
	
	//Matcher Class
	Matcher m=p.matcher("abbbabbaba");
	while(m.find())
	{
	count++;
	System.out.println(m.start()+"------"+m.end()+"------"+m.group());
			
			}
			System.out.println("The no of occurences:"+count);
	
			}
			}

	
//	A Regular Expression is a expression which represents a group of Strings according to a 
//	particular pattern.
//	Example: 
//	 We can write a Regular Expression to represent all valid mail ids.
//	 We can write a Regular Expression to represent all valid mobile numbers.
//	The main important application areas of Regular Expression are: 
//	 To implement validation logic.
//	 To develop Pattern matching applications.
//	 To develop translators like compilers, interpreters etc.
//	 To develop digital circuits.
//	 To develop communication protocols like TCP/IP, UDP etc
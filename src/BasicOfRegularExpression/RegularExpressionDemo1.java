package BasicOfRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
	
	public static void main(String[] args) 
	{
	Pattern p=Pattern.compile("x");
	Matcher m=p.matcher("a1b7@z#");
	
	while(m.find())
	{
	System.out.println(m.start()+"-------"+m.group());
	
	}
	}
	}


//Character classes:
//1. [abc]-------------------Either 'a' or 'b' or 'c'
//2. [^abc] -----------------Except 'a' and 'b' and 'c'
//3. [a-z] --------------------Any lower case alphabet symbol
//4. [A-Z] --------------------Any upper case alphabet symbol
//5. [a-zA-Z] ----------------Any alphabet symbol
//6. [0-9] --------------------Any digit from 0 to 9
//7. [a-zA-Z0-9] ------------Any alphanumeric character
//8. [^a-zA-Z0-9] ------------Any special character
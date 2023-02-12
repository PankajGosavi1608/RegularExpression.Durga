package StringClassSplitMethod;

public class RegularExpressionDemo {
	
	public static void main(String[] args) 
	{
	String s="www.pankaj.com";
	String[] s1=s.split("\\.");
	for(String s2:s1)
	{
	System.out.println(s2);//www


}}
}
//
//String class split() method:
//String class also contains split() method to split the given string against a regular 
//expression. 
//Note : String class split() method can take regular expression as argument where as 
//pattern class split() method can take target string as the argument.
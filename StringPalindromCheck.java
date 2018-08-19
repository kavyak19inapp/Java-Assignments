package palindrome.util;
public class StringPalindromCheck {
	public static void main(String[] args) {
    String input = "helleh";
    System.out.println(input);
    int n=input.length(); 
    StringBuilder input1=new StringBuilder();
    input1.append(input);
    input1=input1.reverse();
    String a=input;
    StringBuilder b=input1;
    String b1 = b.toString();
    System.out.println(a);
    System.out.println(b1);
    if (a.equals(b1)){
    	System.out.println("its a palindrome");
    }
    else{
    	System.out.println("its not a palindrome");
    }
    }}


package package2;

public class Palindrome {

	public static void main(String[] args) {
	String s="malayalam";
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--) {
		char s1=s.charAt(i);
reverse=reverse+s1;
	}

if(s.equals(reverse)) {
	System.out.println("pal");
}
else {
	System.out.println("not pal");}
	}}


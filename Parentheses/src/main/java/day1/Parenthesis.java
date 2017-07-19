package day1;

public class Parenthesis {
	
public static void main(String[] args) {
	//abc¡útrue, (abc)¡útrue, (a)(b(c)¡úfalse,(a)b)c(¡úfalse
	String aString="abc";
	System.out.println(validate(aString));
	String bString="(abc)";
	System.out.println(validate(bString));
	String cString="(a)(b(c)";
	System.out.println(validate(cString));
	String dString="(a)b)c(";
	System.out.println(validate(dString));
}

private static boolean validate(String expr){
	int count = 0;
	for (int i = 0; i < expr.length();i++) {
			if (expr.charAt(i) == '(') {
				count++;			
			} else if (expr.charAt(i)==')') {
				count--;
			} 	
			if (count<0) {
				return false;
			} 
	}	
	return count==0;	
}
}

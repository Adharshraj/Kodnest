package PalindromeChecker;

public class PalindromeCheck {
	boolean Palicheck(int a) {
		int d=0;
		int c=0;
		int b=a;
		while(a>0) {
			c=a%10;
			d=(d*10)+c;
			a=a/10;
		}
		return b==d;
		}
	}



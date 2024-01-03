package Powerofn;

public class powerofn {
	int powerofn(int a, int b) {
		int c=1;
		while(b>0) {
			c=c*a;
			b--;
		}
		return c;
				
	}

}

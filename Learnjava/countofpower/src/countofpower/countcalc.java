package countofpower;

public class countcalc {
	int countcalcu(int a,int b) {
		int c=1;
		int count=0;
		while(b>0) {
			c=c*a;
			b--;
		}
		while(c>0) {
			c=c/10;
			count++;
			
		}
		return count;
	}

}

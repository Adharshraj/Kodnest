package NoofDigits;

public class Noofdigits {
	long noofdigits(long a) {
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		return count;
	}

}

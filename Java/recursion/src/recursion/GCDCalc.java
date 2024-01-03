package recursion;

public class GCDCalc {
	public int GCD(int m,int n) {
		if(n==0) {
			return m;
		}
		else {
		return GCD(n,m%n);	
		}
	}

}

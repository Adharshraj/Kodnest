package StringLevel1;

class DivisionIm extends Thread{
	int a=0;
	int b=0;
	public void run() {
		int res2=a/b;
		System.out.println("Division  result is: "+res2);
	}
	public DivisionIm(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

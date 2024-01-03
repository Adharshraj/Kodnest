package StringLevel1;

class SubstractionIm implements Runnable{
	int a=0;
	int b=0;
	public void run() {
		int res3=a-b;
		System.out.println("Substraction result is: "+res3);
	}
	public SubstractionIm(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

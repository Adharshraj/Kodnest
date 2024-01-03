package StringLevel1;

class Multiplication extends Thread{
	int a=0;
	int b=0;
	public void run() {
		int res1=a*b;
		System.out.println("Multiplication result is: "+res1);
	}
	public Multiplication(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

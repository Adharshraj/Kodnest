package StringLevel1;

class Substraction extends Thread{
	int a=0;
	int b=0;
	public void run() {
		int res3=a-b;
		System.out.println("Substraction result is: "+res3);
	}
	public Substraction(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

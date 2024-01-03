package StringLevel1;

class Division extends Thread{
	int a=0;
	int b=0;
	public void run() {
		int res2=a/b;
		System.out.println("Division  result is: "+res2);
	}
	public Division(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

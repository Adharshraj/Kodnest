package StringLevel1;

class Addition extends Thread{
	int a=0;
	int b=0;
	public void run() {
		int res=a+b;
		System.out.println("Addition result is: "+res);
	}
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
	}
}


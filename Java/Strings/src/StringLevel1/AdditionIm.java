package StringLevel1;

class AdditionIm implements Runnable{
	int a=0;
	int b=0;
	public void run() {
		int res=a+b;
		System.out.println("Addition result is: "+res);
	}
	public AdditionIm(int a, int b) {
		this.a=a;
		this.b=b;
	}
}


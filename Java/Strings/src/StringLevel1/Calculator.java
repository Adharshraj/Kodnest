package StringLevel1;

public class Calculator extends Thread{
	if(Thread.currentThread().getName().equals("Addition")) {
		Addition();
	}
	else if(Thread.currentThread().getName().equals("Substraction")) {
		Substraction();
	}
	else if(Thread.currentThread().getName().equals("Multiplication")) {
		Multiplication();
	}
	else {
		Division();
	}

}

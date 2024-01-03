package Object;

public class FanApp {

	public static void main(String[] args) {
		Fan F1= new Fan();
		F1.No_of_Wings=3;
		F1.cost=2500;
		F1.color="White";
		F1.Brand="Vguard";
		System.out.println(F1.Brand+" "+F1.cost+" "+F1.No_of_Wings+" "+F1.color);
		F1.CanRotate();
		F1.CanBlowAir();
		System.out.println("======================================================================================");
		Fan F2= new Fan();
		F2.No_of_Wings=4;
		F2.cost=3500;
		F2.color="Black";
		F2.Brand="Usha";
		System.out.println(F2.Brand+" "+F2.cost+" "+F2.No_of_Wings+" "+F2.color);
		F2.CanRotate();
		F2.CanBlowAir();
		System.out.println("======================================================================================");
		Fan F3= new Fan();
		F3.No_of_Wings=5;
		F3.cost=4500;
		F3.color="Brown";
		F3.Brand="Crompton";
		System.out.println(F3.Brand+" "+F3.cost+" "+F3.No_of_Wings+" "+F3.color);
		F3.CanRotate();
		F3.CanBlowAir();
		System.out.println("======================================================================================");
		

	}

}

package Object;

public class Fan {
	int No_of_Wings;
	int cost;
	String color;
	String Brand;
	void CanRotate()
	{
		System.out.println("The Fan that you have selected has "+No_of_Wings+" its color is "+color+" it is manufactured by "+Brand+" and which cost "+cost);
	}
	void CanBlowAir()
	{
		System.out.println("The fan you have that blows air is of "+color+" color");
	}

}

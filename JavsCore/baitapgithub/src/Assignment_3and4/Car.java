package Assignment_3and4;

public class Car {
	int speed;
	double regularPrice;
	double getSalePrice;
	String color;
	
	double getSalePrice(){
		return regularPrice;
	}
	
	public Car(int speed, double regularPrice,String color)
	{
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	
}


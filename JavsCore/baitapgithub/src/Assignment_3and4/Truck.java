package Assignment_3and4;

public class Truck extends Car {
	int weight;



	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	double getSalePrice() {
		double Price;
		if (weight > 2000) {
			Price = regularPrice * 0.1;

		} 
		else
			Price = regularPrice * 0.2;
		return Price;
	}
	

}

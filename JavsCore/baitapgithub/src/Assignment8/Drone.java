package Assignment8;

public class Drone extends Bee {
	@Override
	void Damage(int num)
	{
		health = health - num;
	}
	
	@Override
	boolean CheckHealthStatus()
	{
		if(health>50)
		{
			System.out.println("Alive "+health);
		return true;
		}
		if(health<50)
			System.out.println("Dead "+health);
		return false;
	}
}


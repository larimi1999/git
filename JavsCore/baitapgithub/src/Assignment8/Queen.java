package Assignment8;

public class Queen extends Bee{
	@Override
	void Damage(int num)
	{
		health = health - num;
	}
	
	@Override
	boolean CheckHealthStatus()
	{
		if(health>20)
		{
			System.out.println("Alive "+health);
		return true;
		}
		if(health<20)
			System.out.println("Dead "+health);
		return false;
	}
}

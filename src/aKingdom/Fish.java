package aKingdom;

public class Fish extends AnimalAbs
{
	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "Fish Move: 'SWIM'";
	}

	@Override
	public String breath()
	{
		return "Fish Breath: 'GILLS'";
	}

	@Override
	public String reproduce()
	{
		return "Fish Reproduce: 'EGGS'";
	}
}

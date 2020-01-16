package aKingdom;

public class Mammals extends AnimalAbs
{

	public Mammals(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "Mammals Move: 'WALK'";
	}

	@Override
	public String breath()
	{
		return "Mammals Breath: 'LUNGS'";
	}

	@Override
	public String reproduce()
	{
		return "Mammals Reproduce: 'LIVE BIRTHS'";
	}
}

package aKingdom;

public class Birds extends AnimalAbs
{
	public Birds(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "Birds Move: 'FLY'";
	}

	@Override
	public String breath()
	{
		return "Birds Breath: 'LUNGS'";
	}

	@Override
	public String reproduce()
	{
		return "Birds Reproduce: 'EGGS'";
	}
}

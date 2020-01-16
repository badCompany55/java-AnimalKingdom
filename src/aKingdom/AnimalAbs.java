package aKingdom;

public abstract class AnimalAbs
{
	public static int maxId = 0;

	private int id;
	protected String name;
	protected int year;
	private int food;

	public AnimalAbs(String name, int year)
	{
		maxId++;
		id = maxId;
		food = 5;
		this.name = name;
		this.year = year;
	}

	public void consumeFood()
	{
		food--;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}

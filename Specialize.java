class Eat 
{
	public String eating;
	public Eat(String eating)
	{

		this.eating=eating;
	}
	public void ate()
	{
		System.out.println("they are eating");
	}
	public void eatan()
	{
		System.out.println("they are eatan");
	}
}
class Specialize
{
	public static void method(Eat Eat)
	{
		Eat.ate();
		Eat.eatan();
	}

	public static void main(String[] args) 
	{
		method(new Eat("spoon"));
		method(new Eat("hand"));
	}
}

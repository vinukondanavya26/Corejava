interface A
{
	void alphabate();
}
class B implements A
{
	public void alphabate()
	{
		System.out.println("a is an alphabate");
}
}
class C implements A
{
	public void alphabate()
	{
		System.out.println("c is an alphabate");
	}
}
class Runtime24
{
	public static void smallalphabate(A A)
	{
		A.alphabate();
}

	public static void main(String[] args) 
	{
		smallalphabate(new B());
		smallalphabate(new C());
	}
}

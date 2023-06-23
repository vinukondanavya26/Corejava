class A 
{
	public void read()
	{
		System.out.println("they are reading");
	}
	public void walk()
	{
		System.out.println("they are walking");
	}
}
	class B extends A
	{
	}
	class C extends A
	{
	}
	class Genralize
	{
		public static void doll(A a)
		{
			a.read();
			a.walk();
	}

	public static void main(String[] args) 
	{
		doll(new B());
		doll(new C());
	}
}

class Multiplication 
{
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void mul(int b,int a,double c)
	{
		System.out.println(b*a*c);
	}
}
class Compiletym23
{
	public static void main(String[] args) 
	{
		Multiplication.mul(2,3);
		Multiplication.mul(2,3,5.0);
	}
}

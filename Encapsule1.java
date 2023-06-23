class Encapsule
{
	private int weeknumber;
	public void setweek(int weeknumber)
	{
		if(weeknumber>=1 && weeknumber<=12)
		{
			this.weeknumber=weeknumber;
} 
else
		{
	System.err.println("invalid week");
		}
	}
	
		public void getweek()
		{
			switch(weeknumber)
			{
				case 1:System.out.println("sun");
				break;
				case 2:System.out.println("mon");
				break;
				case 3:System.out.println("tue");
				break;
				case 4:System.out.println("wed");
				break;
				case 5:System.out.println("thurs");
				break;
				case 6:System.out.println("fri");
				break;
				case 7:System.out.println("sat");
				break;
			}
		}
	}
	class Encapsule1
	{
	public static void main(String[] args) 
	{
		Encapsule e1=new Encapsule();
		e1.setweek(6);
		e1.getweek();





	}
}

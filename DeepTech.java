class DeepTech
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println("Deep");
			}
			else if(i%5==0)
			{
				System.out.println("Tech");
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("DeepTech");
			}
			else
			{
				System.out.print(" "+i);
			}
		}
	}
}
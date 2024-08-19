package controller;

public class Controller2 
{

	public Controller2()
	{
		super();
	}
	
	public int ContVezes (int n, int n2, int cont)
	{
		if (n == 0)
		{
			return cont;
		}
		else
		{
			if (n2 == n % 10)
			{
				cont = cont + 1;
			}
					
			return ContVezes ((int)n / 10, n2, cont);
		}
	}
	
}

package view;

import javax.swing.JOptionPane;

import controller.Controller2;

public class Main2 
{

	public static void main(String[] args) 
	{
		Controller2 c = new Controller2();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE N: "));;
		
		
			while ( n < 10 || n > 999999)
			{
				n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE N: "));
			}
		
		
		int n2 = 9;
		int cont = 0;
		
		int resultado = c.ContVezes(n, n2, cont);
		
		System.out.println(n + ", tem o numero " + n2 + " : "  + resultado + " vezes." );
		
		
	}
	
}

import Lab1.L1;
import Lab2.L2;
import Lab3.L3;

import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scaner = new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("If you want to acces Lab1 - type 1.\n"
					+ "If You want to acces Lab2 - type 2.\n"
					+ "If You want to acces Lab3 - type 3.\n"
					+ "If You want to close project - type 4.\n");
			n = scaner.nextInt();
			switch(n) {
			case 1:
				{
					System.out.println("Enter size of array in Lab1:");
					n = scaner.nextInt();
					L1 l1 = new L1(n);
					l1.DoShit(scaner);
					break;
				}
			case 2:
				{
					System.out.println("Enter size of Stack in Lab2:");
					n = scaner.nextInt();
					L2 l2 = new L2(n);
					l2.DoShit(scaner);
					break;
				}
			case 3:
				{

					System.out.println("Enter size of Stack in Lab3:");
					n = scaner.nextInt();
					L3 l3 = new L3(n);
					l3.DoShit(scaner);
					break;
				}
			case 4:
				{
					System.out.println("You closed project!!!!");
					System.exit(0);
				}
			}
		}
		
	}
}
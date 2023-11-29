package Main;

import Bots.*;
import java.util.Scanner;


public class Main {
	
	static String m =
			"-------------------------------------\n"
		   +"MENU:\n"
		   +"Bot description:\n"
		   +"1.Slime           2.Villager\n"
		   +"3.Goblin          4.Cooler Villager\n"
		   +"5.Exit\n"
		   +"-------------------------------------";
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
		
	int n;
	while(true)
	 {
		System.out.println(m);
		n = sc.nextInt();
		 
		switch(n)
		{
		 
		 case 1: 
		 {
			Slime.Discription();
			break;
		 }
		 
		 case 3: 
		 {
			 Goblin.Discription();
			 break;
		 }
		 
		 case 2:
		 {
			 Villager.Discription();
			 break;
		 }
		 case 4:
		 {
			 CoolerVillager.Discription();
			 break;
		 }
		 case 5:
		 {
			 sc.close();
			 System.exit(0);
		 }
		}
	 
	 
	 }		
	}
	
	
	
	
}

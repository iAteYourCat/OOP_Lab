package Lab3;

import Stack.Stack;
import java.util.Scanner;

public class L3 {
	Stack stack ;
	int size;
	public L3(int n)
	{
		size = n;
		stack = new Stack( n );
	}
	public void DoShit(Scanner scaner)
	{
		int n;
		String command = "0";
		while(!command.equals("finish"))
		{
			System.out.println("If you want to add integer type add .\n"
					+ "If You want to remove integer type remove.\n"
					+ "If You want to exit Lab3 type remove.\n");
					
			command = scaner.next();
			if(command.equals("add")) 
			{
				System.out.print("Enter integer to add:");
				n = scaner.nextInt();
				stack.push(n);
				System.out.print('\n');
			}
			
			else if(command.equals("remove"))
			{
				System.out.print("You removed: " + stack.pop() + '\n');
			}
			else if(!command.equals("finish")){System.out.print("Command " + command + " doesnt exist, write another command ");}
			
		}
		System.out.println();
	}
}

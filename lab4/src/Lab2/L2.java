package Lab2;

import Stack.Stack;
import java.util.Scanner;


public class L2 {
	private int size;
	private Stack stack;
	public L2(int n)
	{
		size = Math.abs(n);
		stack = new Stack(n);
	}
	
	public void DoShit(Scanner scaner)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter next int ");
			int a = scaner.nextInt();
			stack.push(a);
		}
		for(int i = 0; i < size; i++)
		{
			System.out.println(stack.pop());
		}
	}
}

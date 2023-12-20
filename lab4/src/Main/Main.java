package Main;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Comparator<Integer> com = (o1, o2) -> o1 < o2 ? 1 : -1;
		
		int n=0,x=0, mn= Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
		LinkedList<Integer> list = new LinkedList();
		try
		{
			System.out.print("Enter n: ");
			n = scanner.nextInt();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			n = 0;
		}
		
		//ask user if he wants auto generation
		 
		while(x != 1 && x != 2)
		{
		System.out.println("Generate numbers automatically?\n"
						  +"1.Yes\n"
						  +"2.No\n");
		try
		{
			x = scanner.nextInt();
		}
		catch (Exception e) {
			// TODO: handle exception
			scanner.next();
		}
		}
		
		
		if(x==2)
		for(int i = 0; i < n; i++)
		{
			try
			{
				System.out.print("Enter "+  (int)(i+1) + " number");
				x = scanner.nextInt();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				x = 0;
			}
			mn = mn > x ? x : mn;
			mx = mx < x ? x : mx;
			list.add(x);
			
		}
		else Generate(list, n);
		
		System.out.println("Increasing order:");
		Collections.sort(list);
		System.out.println(list +"\n");
		mn = list.peekFirst();
		mx = list.peekLast();
		
		System.out.println("Decreasing order:");
		Collections.sort(list, com);
		System.out.println(list + "\n");
		

		System.out.println("Min value: " + mn);
		System.out.println("Max value: " + mx);
	}
	
	/**
	 * Auto generation
	 * @param list
	 * @param n size of array
	 */
	static void Generate(List<Integer> list, int n)
	{
		for(int i = 0; i < n; i++)
		{
			list.add(ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE,Integer.MAX_VALUE));
		}
	}
}

package Lab1;
import java.util.Scanner;

public class L1 {
	private int[] a;
	private int n,mx = Integer.MIN_VALUE;
	public L1(int n)
	{
		this.n = n;
		a = new int[n];
	}
	public void DoShit(Scanner scaner)
	{
	 int b ;
	 for(int i = 0; i < n; i++)
	 {
		 System.out.println("Enter next int ");
		 b = scaner.nextInt();
		 b = Math.abs(b);
		 mx = Math.max(mx,b);
		 a[i] = b;
	 }
	 
	 for(int i = 0; i < n;i++)
	 {
		 boolean flag = false;
		 for(int j = 2; j <= Math.sqrt(a[i]);j++)
		 {
		  if(a[i] % j == 0)flag = true;
		 }
		 if(!flag && a[i] != 1)a[i] = 0;
	 }
	 for(int i = 0; i < n;i++)System.out.println(a[i]);
	}
}

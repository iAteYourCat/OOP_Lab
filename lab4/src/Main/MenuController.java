package Main;
import Sclad.*;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.zip.CheckedInputStream;

import org.junit.experimental.categories.Category;

import CustomException.MyException;


public class MenuController {
	/**
	 * 
	 */
	static String message =
			"-------------------------------------------------------------------------------\n"
		   +"Possible actions:\n"
		   +"1.Add element.                 4.Remove head.\n"
		   +"2.Add array of elements.       5.Remove specific elemnt.\n"
		   +"3.Peek at head element.        6.Remove all elements that are of specific type.\n"
		   +"4.Add Collection of elements.  7.Remove all elements.\n"
		   +"\n"
		   +"8.Exit program.\n"
		   +"-------------------------------------------------------------------------------";
	
	static Scanner scanner = new Scanner(System.in);
	static String input;
	
	private static Storage storage = new Storage();
	
	/**
	 * Grant user ability to interact with the program.
	 */
	public static void SelectAction()
	 {
		GetInput(message);
		int x = Integer.parseInt(input);
		try {
		Wait(250);
		switch(x)
		{
			case 1:
				{
				System.out.println(
						"--------------------------------\n"
					   +"You want to add single element.\n"
					   +"Choose element to add.\n"
					   +"--------------------------------\n");
				Wait();
				storage.Add(GetItem());
				break;
				}
			case 2:
				{
							
					GetInput("--------------------------------\n"
							   +"You want to add array.\n"
							   +"Choose size of an Array.\n"
							   +"--------------------------------\n");
					int n = Integer.parseInt(input);
					storage.Add(GenerateItems(n));
					break;
				}
			case 3:
				{
					System.out.println(
							"--------------------------------\n"
						   +"You peeked at head element.\n"
						   + "--------------------------------");
					Wait(500);
					System.out.println("Head element:");
					Wait(500);
					System.out.println(storage.Peek());
					
					System.out.println(
							"--------------------------------\n");
					Wait();
					break;
				}
			case 4:
				{
					System.out.println(
							"--------------------------------\n"
						   +"You removed head element.\n"
						   + "--------------------------------");
					Wait(500);
					System.out.println("Head element removed:");
					Wait(500);
					System.out.println(storage.Remove());
					
					System.out.println(
							"--------------------------------\n");
					Wait();
					break;
				}
			case 5:
				{
					System.out.println(
							"--------------------------------\n"
						   +"You want to delete specific element.\n"
						   +"Choose element to delete.\n"
						   +"--------------------------------\n");
					Wait();
					storage.Remove(GetItem());
					Wait();
					break;
				}
			case 6:
				{
					System.out.println(
							"--------------------------------\n"
						   +"You want to delete all specific elements.\n"
						   +"Choose elements to delete.\n"
						   +"--------------------------------\n");
					Wait();
					storage.RemoveAll(GetItem());
					Wait();
				break;
				}
			case 7:
				{
				System.out.println("You want to delete all elements.\n");
				Wait();
				System.out.println("--------------------------------\n"
								 + "List of deleted elements:\n"
								 + "--------------------------------\n");
				Wait();
				storage.RemoveAll();
				Wait();
				break;
				}
			
			case 8:System.exit(0);
		}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	 }
	
	
	/**
	 * Allows user to choose which element to add.
	 * @return element from {@link Sclad.StorageItems#GetItem StorageItems.GetItem()} method
	 */
	private static StorageItems GetItem()
	{
		GetInput(StorageItems.ItemList);
		return StorageItems.GetItem(
				Integer.parseInt(input)
				);
	}
	/**
	 * Generates random array of elements.
	 * @param arraySize - size of the array
	 * @return array of elements
	 */
	private static StorageItems[] GenerateItems(int arraySize)
	{
		StorageItems[] e = new StorageItems[arraySize];
		for (int i = 0; i < arraySize; i++ ) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
			e[i] = StorageItems.GetItem(randomNum);
			
		}
		return e;
	}
	
	/**
	 * Method that makes Thread sleep.
	 * Used to make a pause between appearing messages. 
	 */
	private static void Wait()
	{
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * Method that makes Thread sleep for a certain amount of time.
	 * @param time - sleep time of a thread.
	 */
	private static void Wait(long time)
	{
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * Make sure that user input does not contain any letters
	 * @param message - message to show again if input contains any letters
	 */
	private static void GetInput(String message) 
	{
		System.out.println(message);
		input = scanner.nextLine();
		
		while(CheckInput(input))
		{
			System.out.println(message + "\n[No letters or negative numbers]");
			input = scanner.nextLine();
		}
		
	}

	/**
	 * Checks if user input contains letters
	 * @param input - user input
	 * @return true if there is letters
	 */
	private static boolean CheckInput(String input)
	{
		for(int i = 0; i < input.length();i++)
		{
			if(!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) return true;
		}
		if(input.length() == 0)return true;
		return false;
	}
	
}

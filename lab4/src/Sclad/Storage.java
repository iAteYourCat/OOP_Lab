package Sclad;

import CustomException.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class Storage{
	
	private Queue<StorageItems> stack;
	
	public Storage()
	{
		stack = new LinkedList<StorageItems>();
		
	}
	/**
	 * Adds element 'e'.
	 * @param e - element to be added
	 * @throws MyException
	 */
	public void Add(StorageItems e) throws MyException
	{
		if(e == null) throw new MyException("\nInvalid argument.");
		stack.add(e);
	}
	
	/**
	 * Adds all of the elements in the specified collection to this collection.
	 * @param e - collection of elements to be added
	 */
	public void Add(Collection<StorageItems> e)
	{
		stack.addAll(e);
	}
	
	/**
	 * Adds array of elements.
	 * @param e - array of elements to be added
	 */
	public void Add(StorageItems... e)
	{
		for (StorageItems it : e) {
			stack.add(it);
			
		}
	}
	/**
	 * Returns but does not delete head element.
	 * @return head element
	 * @throws MyException
	 */
	public StorageItems Peek() throws MyException
	{
		 if(stack.isEmpty())
		 {
		 throw new MyException("\nIts empty.");
		 }
		return stack.peek();
	}
	/**
	 *  Removes and returns the head element.
	 * @return  first element
	 * @throws 	MyException
	 */
	public StorageItems Remove() throws MyException 
	{
		
		 if(stack.isEmpty())
			 {
			 throw new MyException("\nIts empty.");
			 }
		 return stack.remove();
	}
	/**
	 * Removes single element that equals 'e'.
	 * Returns true if element was removed.
	 * @param e - element to be removed
	 * @return true if element was remove and false if nothing was removed
	 */
	public boolean Remove(StorageItems e)
	{
		return stack.remove(e);
	}
	
	/**
	 * Remove all elements.
	 */
	public void RemoveAll()
	{
		int id = 0;
		while(!stack.isEmpty())
			{
			 System.out.println(++id + ". " +stack.remove());
			}
	}
	/**
	 * Removes all elements that are equal to 'e'.
	 * @param e - element to  delete.
	 * @return true if any element was remove and false if nothing was removed
	 */
	public boolean RemoveAll(StorageItems e)
	{
		Predicate<StorageItems> pr = a ->(a == e); 
		return stack.removeIf(pr);
	}
}

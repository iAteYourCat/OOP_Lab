package Sclad;

public enum StorageItems {

	Pen,
	Pencil,
	Notebook,
	Backpack,
	Ruller,
	Eraser;
	
	/**Return element of StorageItems 
	 * @param id index of element to return
	 * @return element of StorageItems
	 */
	public static StorageItems GetItem(int id)
	{
		switch(id)
		{
		case 1: return Pen;
		case 2: return Pencil;
		case 3: return Notebook;
		case 4: return Backpack;
		case 5: return Ruller;
		case 6: return Eraser;
		
		default: return null;
		}
	}
	/**
	 * List of elements in StorageItems
	 */
	public static String ItemList =
			"--------------\n"
			+"Item List:\n"
			+"1.Pen\n"
			+"2.Pencil\n"
			+"3.Notebook\n"
			+"4.Backpack\n"
			+"5.Ruller\n"
			+"6.Eraser\n"
			+"--------------";
}

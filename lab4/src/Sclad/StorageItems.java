package Sclad;

public enum StorageItems {

	Pen,
	Pencil,
	Notebook,
	Backpack,
	Ruller,
	Eraser;
	
	public static StorageItems GetItem(int id)
	{
		switch(id)
		{
		case 0: return Pen;
		case 1: return Pencil;
		case 2: return Notebook;
		case 3: return Backpack;
		case 4: return Ruller;
		case 5: return Eraser;
		
		default: return null;
		}
	}
	public static String ItemList =
			"--------------\n"
			+"Item List:\n"
			+"1.Pen\n"
			+"2.Pencil\n"
			+"3.Notebook\n"
			+"4.Backpack\n"
			+"5.Ruller\n"
			+"6.Eraser\n"
			+"--------------\n";
}

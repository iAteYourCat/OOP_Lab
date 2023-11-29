package Bots;

public class Goblin extends Enemy{

	public Goblin()
	{
		Discription();
	}
	public static void Discription()
	{
		System.out.println(
		"-------------------------------------\n"
	   +"Goblin:\n"
	   +"Its obj of Goblin class\n"
	   +"It does absolutely nothing,\n"
	   +"but it should be stronger than slime.\n"
	   +"Its also can take damage.\n"
	   +"-------------------------------------\n");
	}
	@Override
	public void TakeDamage() {
		// TODO Auto-generated method stub
		
	}
}

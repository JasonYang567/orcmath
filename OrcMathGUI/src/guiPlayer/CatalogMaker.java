package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private ArrayList<MarioPowerUp> list;
	
	public CatalogMaker() {
		list = new ArrayList<MarioPowerUp>();
		list.add(new MarioPowerUp("Mushroom", 50));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CatalogMaker test = new CatalogMaker(); 
		System.out.println(test.getCSVContent());
	}

	public String getCSVContent() {
		String data = "name,price\n";
		for(MarioPowerUp i : list) {
			data += i.toString() + "\n";
		}
		return data;
	}
	
	public void addNewItem(String name, int price) {
		list.add(new MarioPowerUp(name,price));
		System.out.println("Item successfully added!");
	}
	
	boolean numberOrNot(String input)
	{
	    try
	    {
	        Integer.parseInt(input);
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	    return true;
	}
}

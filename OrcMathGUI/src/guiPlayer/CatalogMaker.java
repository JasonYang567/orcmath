package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogMaker {

	private ArrayList<MarioPowerUp> list;
	
	public CatalogMaker() {
		list = new ArrayList<MarioPowerUp>();
		list.add(new MarioPowerUp("Mushroom", 50));
		list.add(new MarioPowerUp("Star", 1000000000));
		list.add(new MarioPowerUp("Flower", 100));
	}

	public static void main(String[] args) {
		CatalogMaker test = new CatalogMaker(); 
		System.out.println(test.getCSVContent());		
		test.testSaveContent("MarioData.csv");
		test.testFileLoading();

	}

	public String getCSVContent() {
		String data = "name,price\n";
		for(MarioPowerUp m : list) {
			data += m.toString() + "\n";
		}
		return data;
	}
	
	public void addNewItem(String name, int price) {
		list.add(new MarioPowerUp(name,price));
		System.out.println("Item successfully added!");
	}
	
	private void testSaveContent(String fileName) {
		try{    
			FileWriter fw=new FileWriter(fileName);    
			for(MarioPowerUp m: list){
				fw.write(m+"\n");
			}
			fw.close();    
			System.out.println("Success! File \""+fileName+"\" saved!");
		}
		catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	public List<MarioPowerUp> testFileLoading() {
		Scanner in = new Scanner(System.in);
		String fileName = "";
		List<MarioPowerUp> content = new ArrayList<MarioPowerUp>();
		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		boolean opened = false;
		while(!opened){
			try {
				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";
				//a BufferedReader enables us to read the file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {
					String[] param = line.split(" ");
					content.add(new MarioPowerUp(param[0], Integer.parseInt(param[1])));
					/*
					 * useful later:
					 * split only a comma that has an even number of quotes ahead of it
 						String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
					 */
				}
				br.close();
				opened = true;
			}
			catch (IOException e) {

				System.out.println("The file name you specified does not exist.");

			}
		}
		//close the Scanner
		in.close();
		return content;
	}
	
	public List<MarioPowerUp> getCatalog(){
		return list;
	}
}

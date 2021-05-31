package model;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * fileManager handles the reading of the text files section of the project. It
 * will read a .txt file of a list of items or suppliers and then create an item
 * or supplier and then add them into an ArrayList of items or suppliers.
 * 
 * @author Brandon Low-On
 *
 */
public class FileManager {
	BufferedReader br;

	/**
	 * readItems will read a text file and create an ArrayList of Item objects
	 * 
	 * @return an ArrayList of type Item
	 * @throws IOException
	 */
	public TheatreList loadTheatreList() {
		TheatreList list = new TheatreList();
		try {
			br = new BufferedReader(new FileReader("theatres.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				Theatre temp = new Theatre(Integer.parseInt(values[0]), values[1], values[2]);
				list.addTheatre(temp);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}

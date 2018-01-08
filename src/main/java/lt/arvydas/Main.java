package lt.arvydas;

import java.io.IOException;
import java.util.List;

import lt.arvydas.controller.NumberStringComparator;
import lt.arvydas.controller.ReadDataFromFile;
import lt.arvydas.controller.WriteDataToFile;

public class Main {

	public static void main(String[] args) throws IOException {
		WriteDataToFile writer = new WriteDataToFile();
		
		//Open and read txt file.
		List<List<String>> data = ReadDataFromFile.readData("input");
		
		//Sort Data.
		data.sort(new NumberStringComparator());
		
		//write data to file
		writer.writeToFile(data, "output");

	}

}

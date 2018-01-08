package lt.arvydas.controller;
/*
 * writes data from list to text file as tab separated strings,
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteDataToFile {
	public void writeToFile(List<List<String>>data, String fileName) throws IOException {
		FileWriter writer = new FileWriter(fileName +".txt");		
		
		for (List<String> lines : data) {
			for (int i = 0; i < lines.size(); i++) {
				writer.write(lines.get(i));
				if (i < lines.size() - 1) {
					writer.write("\t");
				}
			}
			writer.write("\n");

		}
		writer.close();
	}


}

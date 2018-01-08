package lt.arvydas.controller;
/*
 * Reads data from tab separated text file and writes it to List<List<String>>.
 * where every index of List is  List of Strings which contains String from file.
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDataFromFile {
	public static List<List<String>> readData(String fileName) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
		List<List<String>> data = new ArrayList<List<String>>();
		for (String line; (line = br.readLine()) != null; )
	        data.add(Arrays.asList(line.split("\t", -1)));
		br.close();
		//data.forEach(System.out::println);
		return data;

	}
}

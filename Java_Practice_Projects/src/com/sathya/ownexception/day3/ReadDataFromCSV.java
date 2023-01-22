package com.sathya.ownexception.day3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadDataFromCSV {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader(new File("employee.csv"));
			BufferedReader b = new BufferedReader(fr);
			//String[] values;
			String i;
			while ((i = b.readLine()) != null) {
				String[] values = i.split(",");
				System.out.println(values[0]);
				
				//System.out.println();
				
			}
			fr.close();
			b.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		// using scanner class
		Scanner sc = new Scanner(new File("employee.csv"));
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.print(sc.next());
		}
	}

}

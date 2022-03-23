package BeezLabs_Automation_Developer_Internship_project.BeezLabs_Automation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class Convert_CsvToJsonAnd_Mapping_TwoCsv {

	static String line ="";
	static String delimeter =",";
	
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new FileReader("Csv Folder\\Company_Data.csv"));
		BufferedReader reader1 = new BufferedReader(new FileReader("Csv Folder\\Project_Data.csv"));
		BufferedReader reader2 = new BufferedReader(new FileReader("Csv Folder\\Project_Lead.csv"));
		line = reader.readLine();
		
		ArrayList<Object> list = new ArrayList<>();
		ArrayList<Object> list1 = new ArrayList<>();
		ArrayList<Object> list2 = new ArrayList<>();
		
		int index=0;
		int record =0;
		
		
		while((line= reader.readLine())!=null)  {
			
			String[] userData = line.split(delimeter);
			if(record ==0) {
			for(int i=0; i<userData.length; i++) {
				
				if(userData[i].equals("Company Name")) {
					index=i;
					record++;
					break;
				}
				
				list.add(userData[index]);
				System.out.println(list);
				for (Object object : list) {
				String string = object.toString();
				list.add(string);
					
			}
		
	} 		}}
		

		while((line= reader1.readLine())!=null)  {
			
			String[] userData = line.split(delimeter);
			if(record ==0) {
			for(int i=0; i<userData.length; i++) {
				
				if(userData[i].equals("Project Name")) {
					index=i;
					record++;
					break;
				}
				
				list.add(userData[index]);
				System.out.println(list1);
				for (Object object : list1) {
				String string = object.toString();
				list.add(string);
					
			}
		
	} 

			
				
				}
				
			}
		
		

		while((line= reader2.readLine())!=null)  {
			
			String[] userData = line.split(delimeter);
			if(record ==0) {
			for(int i=0; i<userData.length; i++) {
				
				if(userData[i].equals("Project Name")) {
					index=i;
					record++;
					break;
				}
				
				list.add(userData[index]);
				System.out.println(list2);
				for (Object object : list2) {
				String string = object.toString();
				list.add(string);
					
			}
		
	} 

			JSONObject js = new JSONObject();
			js.put(list.get(1),list.get(1));
			js.put(list1.get(1), list1.get(1));
			js.put(list2.get(1), list2.get(1));
			
			
			js.put(list.get(2), list1.get(2));
			js.put(list.get(3), list1.get(2));
			js.put(list2.get(4), list2.get(3));
				
			js.put(list.get(3), list1.get(3));
			js.put(list.get(4), list.get(4));
			js.put(list.get(4),list2.get(2));
			
			
			
			}
		
		
		
			
	
	}
}
}

	
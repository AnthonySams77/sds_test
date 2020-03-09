
import java.io.*;
import java.util.*;

public class sdsTestPrep {

	
	
	public static void main(String[] args) {
		final String DEFAULT_DELIMITER = "\t";
		final String DEFAULT_CSV_DELIMITER = ", ";
		final String filePath = "./bin/MOCK_DATA.txt";
		final String newFilePath = "./bin/MOCK_DATA.csv";
		System.out.println(System.getProperty("user.dir"));
		
		try {
			//variables for reading
			BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
			List<String> tempPersonList = new ArrayList<String>();
			List<Person> personList = new ArrayList<Person>();
			String line;
			
			//variables for writing
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(newFilePath)));
			
			//make a list of strings || one string per person
			while ((line = br.readLine()) != null) {
				tempPersonList.add(line);
			}
			
			for (String personString : tempPersonList) {
				String[] personSplit = personString.split(DEFAULT_DELIMITER);
				
				// creates new person, Variables: id, Fname, Lname, email, gender, ip
				personList.add(new Person(
						personSplit[0],
						personSplit[1],
						personSplit[2],
						personSplit[3],
						personSplit[4],
						personSplit[5]
						));
			}
			br.close();
			
			for (Person person: personList) {
				bw.write(person.toDelimitedString(DEFAULT_CSV_DELIMITER));
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

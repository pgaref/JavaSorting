import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileHandler {
	
	
	public ArrayList<Person> ParseFile(String filename){
		ArrayList<Person> list = new ArrayList<Person>();
		
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(filename));
 
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				String [] tmp = sCurrentLine.split(";");
				if(tmp.length != 5){
					System.err.println("Wrong line format! "+ sCurrentLine + " Len: "+ tmp.length);
					System.exit(-1);
				}
				else{	
					Person p = new Person(tmp[0], tmp[1], Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3]), Integer.parseInt(tmp[4]));
					list.add(p);
				}
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return list;
	}
	
	public void WriteToFile(String filename, ArrayList<Person> data){
		try {

			File file = new File(filename);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Person p: data){
				bw.write(p.toString());
				bw.write("\n");
			}
			bw.close();
 
			System.out.println("Write to File => Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	

}

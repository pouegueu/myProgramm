

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;;

public class filesRead {

	public static ArrayList <ClassData> readFile ()throws IOException {
		JFileChooser chooser = new JFileChooser ();
		ArrayList <ClassData> classList = new ArrayList<ClassData>();// eine Liste um den Inhalt meines Textfiles zu speichern
		//ClassData myclass = new ClassData();

		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {// Return value if approve (yes, ok) is chosen.
			File selectedFile = chooser.getSelectedFile();

			FileReader in = new FileReader(selectedFile);
			ClassData myclass = null;
			ClassProperty property = new ClassProperty();

			BufferedReader bufferedReader = new BufferedReader(in);

			String line;
			while((line = bufferedReader.readLine()) != null){
				if(myclass==null){
					myclass = new ClassData();
					myclass.setClassName(line);//Klassename hinlegen
				}
				else if(line.isEmpty()){
					classList.add(myclass);//add the classname to my List und  
					myclass = null;
				}
				else{
					String [] words = line.split(":");
					
                          property.setPropertyName(words[0].trim());// eigenschaft
                          property.setPropertyType(words[1].trim());// typ, trim Methode löscht alle leere Zeichnen	
						  myclass.getPropertyList().add(property);// add variablename und typ into my classData
					}

				}

			in.close();

		}

		return classList;
	}
	public static void main (String [] args) throws IOException {
		ArrayList <ClassData> data = readFile();

		for(int i = 0; i < data.size(); i++){
		
			System.out.println(data.get(i));
		}
		System.out.println(data.size());
	}

}


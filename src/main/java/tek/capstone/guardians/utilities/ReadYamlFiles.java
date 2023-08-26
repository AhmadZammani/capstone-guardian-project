package tek.capstone.guardians.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {

	private static ReadYamlFiles readYamalFiles;
	private HashMap propertyMap;

	private ReadYamlFiles(String filepath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);

		Yaml yaml = new Yaml();
		this.propertyMap=yaml.load(fileInputStream);
	}
 public static ReadYamlFiles getInstance (String filepath)throws FileNotFoundException{
	 if(readYamalFiles==null)
		 readYamalFiles= new ReadYamlFiles(filepath);
	 return readYamalFiles;
 }
	
	public HashMap getYamlProperty(String key) {
		return (HashMap)this.propertyMap.get(key);
		
	}
	
}

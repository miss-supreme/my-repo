package textfiles;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadData {
	private String path;
	public ReadData (String FilePath){
		path = FilePath;
	}
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = 2;
		String[] textData = new String[numberOfLines];
		
		int i;
		for(i=0; i < numberOfLines; i++){
			textData[i] = textReader.readLine();
		}
	}
}

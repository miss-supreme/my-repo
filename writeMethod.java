import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.csvreader.CsvWriter;


public class Test {
	
	String question = "test question";
	String answer = "test answer";
	
	addQuestion(question, answer);
	
	public void addQuestion(String q, String a) {

			String outputFile = "geometry_test.csv";
			
			// before we open the file check to see if it already exists
			boolean alreadyExists = new File(outputFile).exists();
				
			try {
				// use FileWriter constructor that specifies open for appending
				CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
				
				// if the file didn't already exist then we need to write out the header line
				if (!alreadyExists)
				{
					csvOutput.write("id");
					csvOutput.write("name");
					csvOutput.endRecord();
				}
				// else assume that the file already has the correct header line
				
				// write out a few records
				csvOutput.write(q);
				csvOutput.endRecord();
				
				csvOutput.write(a);
				csvOutput.endRecord();
				
				csvOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			


	}
}
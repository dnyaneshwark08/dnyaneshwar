import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

	public static void dateExtraction(String regex)
	{
		Pattern pattern = Pattern.compile(regex);
		String line;
		int flag =0;
		
		try {
			
			//Reading the data present in a given file from FileReader using the BufferedReader.
	        //Here, the location is the path of the file. Kindly change the location to the correct location of the required file in your system. 
	        String location = "D:\\ACS\\date.txt"; 
	        
	        BufferedReader lineReader = new BufferedReader(new FileReader(location));
	        
	      //Reading the contents of the file line by line
	        while((line = lineReader.readLine()) != null) {
	        	Matcher matchePattern = pattern.matcher(line);
	        	
	        	 //Enters the while loop only if there is a match found.
	        	
	        		while(matchePattern.find()) {
	        			System.out.println(matchePattern.group());
	                    flag = 1;
	        		}
	        }
	        if(flag == 0) {
	        	//This condition is entered when there are no dates found in any line.
	            System.out.println("The file does not contain dates.");
	        }
	        lineReader.close();
			
		} catch (IOException e) {
			 // Occurs whenever an input or output operation is failed or interpreted. 
	        //For example, trying to read from a file that does not exist. 
	        System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		 //Regular Expression to recognize all the dates of the format 'dd/mm/yyyy' or 'dd-mm-yyyy'.       
        String regex = "(0?[1-9]|[12][0-9]|3[01])[/|-](0?[1-9]|1[0-2])[/|-][0-9]{4}";
        
        dateExtraction(regex);
	}
}

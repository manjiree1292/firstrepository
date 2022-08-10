package testcases;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class HowToReadExcel {
	
	@Test
	public void readExcel() throws FileNotFoundException
	{
		File file=new File("src/test/resources/Manjiree.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook xss=new XSSFWorkbook();
		
		HSSFWorkbook 
		
	}

}

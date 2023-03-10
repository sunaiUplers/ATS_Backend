package utilites_ATS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadXlsx_Talents {

	
	@DataProvider(name="Talent_Data")
	public static String[][] Add_Talent_Data() throws IOException {

		File src = new File("C:\\Users\\Admin\\ATS_Backend_Funnel_Automation\\Data_Excel\\Talents\\Add_Talents.xlsx");
		FileInputStream input = new FileInputStream(src);
		Workbook wb = new XSSFWorkbook(input);
		Sheet sheet=wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getLastCellNum();
		String [][] data = new String[rows-1][column];
		for(int i=0 ; i< rows -1;i++) {
			for (int j = 0; j < column; j++) {
				DataFormatter df = new DataFormatter();
				data [i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
			
			}
		}
		wb.close();
		input.close();
		return data;
	}


}
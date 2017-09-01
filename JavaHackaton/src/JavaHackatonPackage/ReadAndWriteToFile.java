package JavaHackatonPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadAndWriteToFile {

	public static String[] readXLSheet(String dt_path1, String sheetName) throws IOException
	{
		//Step1: Get the Xl Path
        File xlFile= new File(dt_path1);
		
        //Step 2:Access the Xl file
		FileInputStream xlDoc=new FileInputStream(xlFile);
		
		//Step 3:Aceess the workbook
		HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
		
		//Step 4:Access the worksheet
		HSSFSheet sheet=wb.getSheet(sheetName);
		
		
		/*String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);*/
		
		int iRowCount=sheet.getLastRowNum()+1;
	
		
		String[] xlData=new String[iRowCount];

		for(int i=0;i<iRowCount;i++)
		{
			xlData[i]=sheet.getRow(i).getCell(0).getStringCellValue();
			
			
		}
		
		return xlData;
	}
	
	public static void writeXlSheet(String[] readXL) throws IOException
	{
	
		FileOutputStream fileOut = new FileOutputStream("write3.xls");
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet worksheet = workbook.createSheet("sheet1");
		
	    int j=0;
	    HSSFRow row1;
	    HSSFCell cellA1;
		for(int i=readXL.length-1;i>=0;i--)
		{
		
			row1 = worksheet.createRow(j);

			cellA1 = row1.createCell(0);
			
			cellA1.setCellValue(readXL[i]);
			j++;
			
		}

		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String dt_path1 = "C:/Users/VHEGDE/Desktop/read.xls";
	
		
		String[] readXL=readXLSheet(dt_path1,"Sheet1");
		writeXlSheet(readXL);
		System.out.println("Content of file1 is copied into file2 in reverse order");
		
			
	}


}


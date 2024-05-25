package UtilityPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class ExcelUtils {
	
	
	public static String[] getToReadExcelData(String sTestCaseID, String Sheeet)
	{
		String sData[]=null;
		
		
		try
		{
			String filepath = PropertiesLoader.getProperties("TestDataPath");
			FileInputStream fis = new FileInputStream(new File(filepath));
			try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
				XSSFSheet sht = wb.getSheet(Sheeet);
				int iRowNum= sht.getLastRowNum();
         
				for(int i=1; i<=iRowNum; i++)
				{
				    if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
				    {
				        int iCellNum=sht.getRow(i).getLastCellNum();
				        sData= new String[iCellNum];
				       
				        for(int j=0; j<iCellNum; j++)
				        {
				            DataFormatter formatter = new DataFormatter();
				            Cell cell = sht.getRow(i).getCell(j);
				            sData[j] = formatter.formatCellValue(cell);
				             
				            //sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
				        }
				       
				        break;
				    }
				}
			}
       
   
        }
       
    catch(EncryptedDocumentException ex){
        ex.printStackTrace();
    }
        


    catch(IOException ex){
        ex.printStackTrace();
    }
        return sData;
       
     }

 

}

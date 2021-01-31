package com.Ecommerce.SkillRary.genericlibs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author QSP
 *
 */
public class Excelfile implements AutoConstant{
	/**
	 * Read the data from the excel file
	 * @param Sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public static String getExceldata(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
FileInputStream f=new FileInputStream(excelpath);
Workbook wb = WorkbookFactory.create(f);
return wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		
	}

}

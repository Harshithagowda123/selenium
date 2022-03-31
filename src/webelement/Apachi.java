package webelement;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Apachi {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./excel/abc.xlsx");
             Workbook wb = WorkbookFactory.create(fis);
             Sheet s = wb.getSheet("sheet1");
             Row r = s.getRow(1);
             Cell c = r.getCell();
             String value = c.getStringCellValue();
             System.out.println(value);
             
	}

}

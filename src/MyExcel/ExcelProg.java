package MyExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile=new File("D:\\Velocity\\TestExcel.xlsx");
		//1.String Value
		String name = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		//2.Numeric Type
		double name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(name1);
		//3/char value
		String name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(name2);
		//4.Boolean value
		boolean name3 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(name3);
		
		

	}

}

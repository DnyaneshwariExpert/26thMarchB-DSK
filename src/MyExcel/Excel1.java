package MyExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	       File myfile=new File("D:\\Velocity\\TestExcel.xlsx");
	       Workbook book = WorkbookFactory.create(myfile);
	       Sheet mysheet = book.getSheet("Sheet3");
	     Row myrow = mysheet.getRow(3);
	       Cell mycell = myrow.getCell(3);
	       int rows = mysheet.getLastRowNum();
	       System.out.println("Total no of rows are "+rows);
	       int rows1 = mysheet.getFirstRowNum();
//	       System.out.println(mycell.getCellType());
           System.out.println("=======================");
           //code for reading whole data from excel sheet
           Sheet mysheet2 = book.getSheet("Sheet3");
           for(int i=0;i<=9;i++)
           {
        	   for(int j=0;j<=2;j++)
        	   {
        		   double value = mysheet2.getRow(i).getCell(j).getNumericCellValue();
        		   System.out.print(value +" ");
        		   
        	   }
        	   System.out.println();
           }
           System.out.println("============================================");
          
	}

}

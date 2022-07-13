package MyExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DyanamicExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Velocity\\TestExcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		int TotalnumOfrow = mysheet.getLastRowNum();
		int rowcount = TotalnumOfrow;
		System.out.println("Total number of row counts are "+rowcount);
		short cells = mysheet.getRow(rowcount).getLastCellNum();
		int cellcount = cells-1;
		System.out.println("Total number of cells are "+cellcount);
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=cellcount;j++)
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType datatype = cellvalue.getCellType();
				if(datatype==CellType.STRING)
				{ 
					String value = cellvalue.getStringCellValue();
					System.out.print(value +" ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value +" ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		

	}

}

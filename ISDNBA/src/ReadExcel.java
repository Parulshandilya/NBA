import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
//import org.apache.poi.poifs.filesystem.POISFileSystem;
public class ReadExcel {
	
public static void main(String [] args)  throws IOException{
	
	
	 /*File myFile = new File("/home/parul/eclipse-workspace/ISDNBA/marks/Marks AI.xlsx");
     FileInputStream fis = new FileInputStream(myFile);

     // Finds the workbook instance for XLSX file
     XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
    
     // Return first sheet from the XLSX workbook
     XSSFSheet mySheet = myWorkBook.getSheetAt(0);
    
     // Get iterator to all the rows in current sheet
     Iterator<Row> rowIterator = mySheet.iterator();
    
     // Traversing over each row of XLSX file
     while (rowIterator.hasNext()) {
         Row row = rowIterator.next();

         // For each row, iterate through each columns
         Iterator<Cell> cellIterator = row.cellIterator();
         while (cellIterator.hasNext()) {

             Cell cell=cellIterator.next();
             System.out.println(cell.toString()+";");
          
             }
         System.out.println();
         }
         System.out.println("");
         myWorkBook.close();
         fis.close();


*/
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/marks/Marks AI.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        //to travel into the Excel spreadsheet
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
            Iterator<Cell> cell_Iterator = r.cellIterator();
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
                
             
                 c = cell_Iterator.next();
                 System.out.println(c.toString()+";");
                //Cursor points to cell
              /*  switch (c.getCellType())    {
                case Cell.CELL_TYPE_STRING:
                    System.out.print(c.getStringCellValue()+"\t");
                    //System.out.println("Case String");
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    System.out.print(c.getNumericCellValue()+"\t");
                    //System.out.println("Case number");
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    System.out.print(c.getBooleanCellValue()+"\t");
                    System.out.println("Case boolean");
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    System.out.print(c.getCellFormula()+"\t");
                    //System.out.println("Case formula");
                    break;
                default:
                } */                 
            }
            System.out.println();//next to display in table format
       }            
        mybook.close();
        fIO.close();
    }
    catch(FileNotFoundException ef){
        ef.printStackTrace();
    }
    catch(IOException ei){
        ei.printStackTrace();
    }
}
}

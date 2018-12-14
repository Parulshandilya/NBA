import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import java.awt.event.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.xdevapi.Statement;

import java.util.*;
//import org.apache.poi.poifs.filesystem.POISFileSystem;
public class ReadExcel {
     float [] indirectFinal=new float[15];
     float [] directFinal=new float[15];
	int[] indirect=new int[7];
	//int[] direct=new int[7];
	int[] direct= {65,65,64,70,70,0,0};
	int[][] COvsAC=new int[7][6];
	int[][] COvsACN=new int[7][6];
	int[][] COMatrix=new int[7][15];
	int[] mul,success,success_rate;

	Connection con=null;
	
public void reading(String coursename,String year,String branchname,String classsize)  throws IOException{
	System.out.println(classsize);
	try {
		
		 
		DbConnection d=new DbConnection();
		con=d.getConnection();
	try {
		String s="use isdlab";
		PreparedStatement p=con.prepareStatement(s);
		p.executeQuery(s);
	}catch(Exception c) {
		System.out.println("isd lab nh chl rh");
	}
	try {
		 String s="create table "+coursename+"_"+year+"_Marks"+"(Sno int,roll_no varchar(255), name varchar(255) ,AC1 int,AC2 int,AC3 int,AC4 int,AC5 int,AC6 int,total int)";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
		
	}
	catch(Exception ex)
	{
		System.out.println("error in creating marks table in database"+ex);
	}
	try {
		 String s="create table "+coursename+"_"+year+"_COAttainment"+"(AC1 int,AC2 int,AC3 int,AC4 int,AC5 int,AC6 int)";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
			s="insert into "+ coursename +"_"+ year +"_COAttainment"+" values("+classsize+","+classsize+","+classsize+","+classsize+","+classsize+","+classsize+")";
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating co attainment table "+ex);
	}
	try {
		 String s="create table "+coursename+"_"+year+"_DirectIndirectTable"+"(Type varchar(255),PO1 float,PO2 float,PO3 float,PO4 float,PO5 float,PO6 float,PO7 float,PO8 float,PO9 float,PO10 float,PO11 float,PO12 float,PSO1 float,PSO2 float,PSO3 float)";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
			s="insert into "+ coursename +"_"+ year +"_DirectIndirectTable"+" values('direct',.67034,.6581,.6749,.6726,.6826,.6744,.7071,.70711,.6692,.6664,.7071,.68756,.6768,.67833,.7071)";
			p.executeUpdate(s);
			s="insert into "+ coursename +"_"+ year +"_DirectIndirectTable"+" values('indirect',.89,.9017,.8125,.8434,.8906,.8920,.8438,.8125,.84373,.8593,.875,.883,.8636,.8612,.8125)";
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating DirectIndirect table "+ex);
	}
	}
	catch(Exception e)
	{
		System.out.println("ERRROR........");
	}
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_Marks.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        r=rowIterator.next();
        //to travel into the Excel spreadsheet
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
             String ss="insert into "+ coursename+"_"+year+"_Marks "+"values ( " ;
            Iterator<Cell> cell_Iterator = r.cellIterator();
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
                              
             
                 c = cell_Iterator.next();
                 ss+="'"+c.toString()+"'"+",";
                 
                 System.out.print(c.toString()+";");
                           
            }
            ss=ss.substring(0,ss.length()-1);
            ss+=")";
            System.out.println(ss);
            try {
            PreparedStatement p=con.prepareStatement(ss);
			p.executeUpdate(ss);}
            catch(Exception f)
            {
            	System.out.println("insetrhgb"+f);
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

public void reading1(String coursename,String year,String branchname,String classsize)  throws IOException{
	int[] percentage;

    percentage=new int[6];
    int[] threshold;
    threshold=new int[6];
	try {
		
		 
		DbConnection d=new DbConnection();
		con=d.getConnection();
	try {
		String s="use isdlab";
		PreparedStatement p=con.prepareStatement(s);
		p.executeQuery(s);
	}catch(Exception c) {
		System.out.println("isd lab nh chl rh");
	}
	try {
		 String s="create table "+coursename+"_"+year+"_COvsAC"+"(AC1 int,AC2 int,AC3 int,AC4 int,AC5 int,AC6 int)";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating marks table in database"+ex);
	}
	}
	catch(Exception e)
	{
		System.out.println("ERRROR........");
	}
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_COvsAC.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        
        //to travel into the Excel spreadsheet
      r=rowIterator.next();
      int i=1;
      int rr=0;
        while(rowIterator.hasNext())    {
             r = rowIterator.next();

            //Cursor points to row
             String ss="insert into "+ coursename+"_"+year+"_COvsAC "+"values ( " ;
            Iterator<Cell> cell_Iterator = r.cellIterator();
            c=cell_Iterator.next();
            String k="insert into "+coursename+"_"+year+"_COAttainment values (";
            int j=0,f=0;
            int cc=0;
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
            	c = cell_Iterator.next();
                String p=c.toString();
                float ko=Float.valueOf(p);
                int pp=Math.round(ko);
                if(rr==7)
                	break;
                 if(i==1)
                 {
                	 //System.out.println(pp);
                	 threshold[f++]=pp;
                	
                 }
                 else if(i==2)
                 {
                	 percentage[j++]=Integer.parseInt(Integer.toString(pp));
                 }

                	 k+="'"+Integer.toString(pp)+"'"+",";
                 
                 ss+="'"+Integer.toString(pp)+"'"+",";
                 if(i!=1 && i!=2)
                 {
                	 COvsAC[rr][cc]=pp;
                	 COvsACN[rr][cc]=pp*percentage[cc]/100;
                 }
                 
                 System.out.print(Integer.toString(pp));
              cc++;             
            }
          
            if(i==1)
            {
            	k=k.substring(0,k.length()-1);
                k+=")";
                System.out.println(k);
                try {
                PreparedStatement p=con.prepareStatement(k);
                System.out.print(k);
    			p.executeUpdate(k);}
                catch(Exception fucka)
                {
                	System.out.println("insetrhgjjhghyfgrgf11"+fucka);
                }
            }
            ss=ss.substring(0,ss.length()-1);
            ss+=")";
            System.out.println(ss);
            try {
            PreparedStatement p=con.prepareStatement(ss);
			p.executeUpdate(ss);}
            catch(Exception foon)
            {
            	System.out.println("insetrhgb111111"+foon);
            }
            
           System.out.println();//next to display in table format
           i++;
           if(i!=1 && i!=2)
           rr++;
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
	try {
		
		success_rate=new int[6];
		success=new int[6];
		mul=new int[6];
		PreparedStatement p;
		String s="select count(*) from "+coursename+"_"+year+"_Marks"+" where AC";
		//Statement  s=con.createStatement();
		for(int i=0;i<6;i++)
		{
				String k=s+Integer.toString(i+1);
				mul[i]=threshold[i]*percentage[i]/100;
				k=k+">= "+Integer.toString(mul[i]);
				System.out.println(k);
				p=con.prepareStatement(k);
				ResultSet rs=p.executeQuery(k);
				if(rs.next())
				success[i]=rs.getInt(1);
				//System.out.println("success mai yey jata hai "+success[i]);
				success_rate[i]=success[i]*100/Integer.parseInt(classsize);
				
			    
		}
	    s="insert into "+coursename+"_"+year+"_COAttainment"+" values (";
	    String ss="insert into "+coursename+"_"+year+"_COAttainment"+" values (";
		for(int i=0;i<6;i++)
		{
			s+=Integer.toString(success[i])+",";
			ss+=Integer.toString(success_rate[i])+",";
			
		}
		s=s.substring(0, s.length()-1);
		ss=ss.substring(0, ss.length()-1);
		ss+=")";
		s+=")";
		System.out.println(s);
		System.out.println(ss);
		p=con.prepareStatement(s);
		p.executeUpdate(s);
		p=con.prepareStatement(ss);
		p.executeUpdate(ss);
		for(int i=0;i<6;i++)
		{
			System.out.println(success[i]);
		}
		
	}
	catch(Exception lala)
	{
		System.out.println(lala);
	}
	for(int jx=0;jx<7;jx++)
	{
	
		for(int jy=0;jy<6;jy++)
		{
			System.out.print(COvsACN[jx][jy]+"  ");
		}
		System.out.println();
	}
	for(int jx=0;jx<7;jx++)
	{
		int sum=0;
		for(int jy=0;jy<6;jy++)
		{
			sum+=COvsACN[jx][jy];
			indirect[jx]+=success_rate[jy]*COvsACN[jx][jy];
		}
		if(sum!=0)
		{indirect[jx]/=sum;}
		System.out.println("INDIRECT WEIGHT");
		System.out.println(indirect[jx]+" ");
	}
}

public void reading2(String coursename,String year,String branchname,String classsize)  throws IOException{
	try {
		
		 
		DbConnection d=new DbConnection();
		con=d.getConnection();
	try {
		String s="use isdlab";
		PreparedStatement p=con.prepareStatement(s);
		p.executeQuery(s);
	}catch(Exception c) {
		System.out.println("isd lab nh chl rh");
	}
	try {
		 String s="create table "+coursename+"_"+year+"_COMatrix"+"(PO1 int,PO2 int,PO3 int,PO4 int,PO5 int,PO6 int,PO7 int,PO8 int,PO9 int,PO10 int,PO11 int,PO12 int, PSO1 int, PSO2 int, PSO3 int)";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating marks table in database"+ex);
	}
	}
	catch(Exception e)
	{
		System.out.println("ERRROR........");
	}
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_COMatrix.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        //to travel into the Excel spreadsheet
      r=rowIterator.next();
      int rr=0;
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
             String ss="insert into "+ coursename+"_"+year+"_COMatrix "+"values ( " ;
            Iterator<Cell> cell_Iterator = r.cellIterator();
            c=cell_Iterator.next();
            int cc=0;
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
                System.out.println(rr+"rr_cc "+cc);              
             
                 c = cell_Iterator.next();
                 ss+="'"+c.toString()+"'"+",";
                 String p=c.toString();
                 float ko=Float.valueOf(p);
                 int pp=Math.round(ko);
                 COMatrix[rr][cc]=pp;
                 System.out.print(c.toString()+";");
                     cc++;      
            }
            ss=ss.substring(0,ss.length()-1);
            ss+=")";
            System.out.println(ss);
            try {
            PreparedStatement p=con.prepareStatement(ss);
			p.executeUpdate(ss);}
            catch(Exception f)
            {
            	System.out.println("insetrhgb111111"+f);
            }
            
           System.out.println();//next to display in table format
           rr++;
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
	for(int jy=0;jy<15;jy++)
	{
		indirectFinal[jy]=0;
		float sum=0;
		for(int jx=0;jx<7;jx++)
		{
			sum+=COMatrix[jx][jy];
			//System.out.println("coooo"+COMatrix[jx][jy]);
			System.out.println("INDIRECT"+indirect[jx]);
			
			indirectFinal[jy]+=(float)COMatrix[jx][jy]*(float)indirect[jx];
		}
		if(sum!=0)
		{
			indirectFinal[jy]=(float)indirectFinal[jy]/(float)sum;
		}
		System.out.print(indirectFinal[jy]+" ");
	}
	System.out.print("DIRECT FEEDBACK");
	for(int jy=0;jy<15;jy++)
	{
		directFinal[jy]=0;
		float sum=0;
		for(int jx=0;jx<7;jx++)
		{
			sum+=COMatrix[jx][jy];
			directFinal[jy]+=(float)COMatrix[jx][jy]*direct[jx];
		}
		if(sum!=0)
		{
			directFinal[jy]=indirectFinal[jy]/sum;
		}
		System.out.print(directFinal[jy]+" ");
	}
}

public void reading3(String coursename,String year,String branchname,String classsize)  throws IOException{
	try {
		
		 
		DbConnection d=new DbConnection();
		con=d.getConnection();
	try {
		String s="use isdlab";
		PreparedStatement p=con.prepareStatement(s);
		p.executeQuery(s);
	}catch(Exception c) {
		System.out.println("isd lab nh chl rh");
	}
	try {
		 String s="create table "+ coursename +"_"+year+"_POList"+"(GraduateAttributes varchar(255),PONo varchar(255),POStatement varchar(600))";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating marks table in database"+ex);
	}
	}
	catch(Exception e)
	{
		System.out.println("ERRROR........");
	}
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_POList.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        //to travel into the Excel spreadsheet
     // r=rowIterator.next();
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
             String ss="insert into "+ coursename+"_"+year+"_POList "+"values ( " ;
            Iterator<Cell> cell_Iterator = r.cellIterator();
           // c=cell_Iterator.next();
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
                              
             
                 c = cell_Iterator.next();
                 ss+="'"+c.toString()+"'"+",";
                 
                 //System.out.print(c.toString()+";");
                           
            }
            ss=ss.substring(0,ss.length()-1);
            ss+=")";
            //System.out.println(ss);
            try {
            PreparedStatement p=con.prepareStatement(ss);
			p.executeUpdate(ss);}
            catch(Exception f)
            {
            	System.out.println("insetrhgb111111"+f);
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
public void reading4(String coursename,String year,String branchname,String classsize)  throws IOException{
	try {
		
		 
		DbConnection d=new DbConnection();
		con=d.getConnection();
	try {
		String s="use isdlab";
		PreparedStatement p=con.prepareStatement(s);
		p.executeQuery(s);
	}catch(Exception c) {
		System.out.println("isd lab nh chl rh");
	}
	try {
		 String s="create table "+coursename+"_"+year+"_COStatement"+"(CONo varchar(255),COStatement varchar(600))";
		 PreparedStatement p=con.prepareStatement(s);
			p.executeUpdate(s);
	}
	catch(Exception ex)
	{
		System.out.println("error in creating marks table in database"+ex);
	}
	}
	catch(Exception e)
	{
		System.out.println("ERRROR........");
	}
	
	try{
        File newFile = new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_COStatement.xlsx");
        FileInputStream fIO = new FileInputStream(newFile);
        XSSFWorkbook mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        //to travel into the Excel spreadsheet
      r=rowIterator.next();
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
             String ss="insert into "+ coursename+"_"+year+"_COStatement "+"values ( " ;
            Iterator<Cell> cell_Iterator = r.cellIterator();
            c=cell_Iterator.next();
            while(cell_Iterator.hasNext())  {
            	//c=cell Iterator.next();
                              
             
                 c = cell_Iterator.next();
                 ss+="'"+c.toString()+"'"+",";
                 
                // System.out.print(c.toString()+";");
                           
            }
            ss=ss.substring(0,ss.length()-1);
            ss+=")";
            //System.out.println(ss);
            try {
            PreparedStatement p=con.prepareStatement(ss);
			p.executeUpdate(ss);}
            catch(Exception f)
            {
            	System.out.println("insetrhgb111111"+f);
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


package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;
	
	public Login(String excelPath, String sheetName) {
		try {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		
		userLogin(0,0);
		passWord(0,0);
	}
	
	
	public static int getRowCount() {
		int rowCount=0;
		try {
			rowCount= sheet.getPhysicalNumberOfRows();
			
		    }
		catch (Exception e) {		
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		 }	
		return rowCount;
	
	}
	
	public static int getColCount() {
		int colCount=0;
		try {
			colCount= sheet.getRow(0).getPhysicalNumberOfCells();
			
		    }
		catch (Exception e) {		
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		 }	
		return colCount;
	
	}
	
	public static String userLogin(int rowNum,int colNum) {
		String username=null;
		try {
			username= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//			System.out.println(username);
		    }
		catch (Exception e) {		
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		 }
		return username;	
	
	}
	
	
	public static void passWord(int rowNum,int colNum) {
		
		try {
			
			String password= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
		    }
		catch (Exception e) {		
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		 }	
	
	}

}

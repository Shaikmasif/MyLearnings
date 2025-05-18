package com.ExcelReading.ExcelFileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        File file = new File("F:\\EmpDetails.xlsx");
        List<Employee> list = readExcelData(file);
        System.out.println(list);
    }

    private static List<Employee> readExcelData(File file) {
        List<Employee> list = new LinkedList<>();
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            XSSFSheet sheet = workbook.getSheet("Sheet1y");
            Iterator<Row> rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                int rowNumber = currentRow.getRowNum();
                System.out.println("Row Number = " + rowNumber);
                if (rowNumber == 0) {
                    continue;
                }
                Employee e = new Employee();
                Iterator<Cell> cellIterator = currentRow.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    int colIndex = currentCell.getColumnIndex();
                    System.out.println("Column Index : " + colIndex);
                    switch (colIndex) {
                        case 0: {
                            int empId = (int) currentCell.getNumericCellValue();
                            e.setId(empId);
                            break;
                        }
                        case 1: {
                            String empName = currentCell.getStringCellValue();
                            e.setName(empName);
                            break;
                        }
                        case 2: {
                            int empSalary = (int) currentCell.getNumericCellValue();
                            e.setSalary(empSalary);
                            break;
                        }
                        default:
                            throw new IllegalArgumentException("Unexpected value: " + colIndex);
                    }
                }
                list.add(e); // Add the employee to the list
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
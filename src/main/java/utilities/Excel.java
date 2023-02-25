package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	private static final String FILE_NAME = "C:\\Users\\ubiswas\\git\\cucumberpet\\Login.xlsx";

	public static List<Map<String, String>> getTestData(String sheetname) {
		List<Map<String, String>> testData = new ArrayList<>();
		

		try {
			Workbook workbook = WorkbookFactory.create(new FileInputStream(FILE_NAME));
			Sheet sheet = workbook.getSheet(sheetname);
			int roNums = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			int colNums = sheet.getRow(0).getLastCellNum();
			

			for (int i = 1; i < roNums; i++) {
				Map<String, String> map = new HashMap<String, String>();
				Row row = sheet.getRow(i);
				for (int j = 0; j < colNums; j++) {
					Cell cell = row.getCell(j);
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					String cellvalueString = cell.getStringCellValue();
					map.put(key, cellvalueString);
					
				}
				testData.add(map);
			}

		} catch (Exception e) {
			throw new RuntimeException("Failed to read test data from Excel sheet", e);
		}
		return testData;
	}

}

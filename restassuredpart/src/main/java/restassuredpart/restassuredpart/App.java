package restassuredpart.restassuredpart;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<User>();

        // Fetch users from page 1 to 2 (you can change the limit as per need)
        for (int i = 1; i <= 2; i++) {
            String url = "https://reqres.in/api/users?page=" + i;
            Response response = RestAssured.get(url);

            // Loop through users in the data array
            List<Object> userData = response.jsonPath().getList("data");
            for (int j = 0; j < userData.size(); j++) {
                String id = response.jsonPath().getString("data[" + j + "].id");
                String firstName = response.jsonPath().getString("data[" + j + "].first_name");
                String lastName = response.jsonPath().getString("data[" + j + "].last_name");
                String email = response.jsonPath().getString("data[" + j + "].email");
                // Add user to the list
                users.add(new User(id, firstName, lastName, email));
            }
        }
        System.out.println(users.size());
        // Write users data to Excel
        writeUserDataToExcel(users);
        System.out.println(users.size());
    }

    // Method to write user data to Excel
    public static void writeUserDataToExcel(List<User> users) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Users Data");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("First Name");
        headerRow.createCell(2).setCellValue("Last Name");
        headerRow.createCell(3).setCellValue("Email");

        // Write each user data to the Excel
        int rowNum = 1;
        for (User user : users) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(user.getId());
            row.createCell(1).setCellValue(user.getFirstName());
            row.createCell(2).setCellValue(user.getLastName());
            row.createCell(3).setCellValue(user.getEmail());
        }

        // Write the output to the Excel file
        try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\lenovo\\Downloads\\UsersData.xlsx")) {
            workbook.write(fileOut);
        }
        workbook.close();
        System.out.println("Data successfully written to Excel!");
    }
}

// User class to store data
class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public User(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}


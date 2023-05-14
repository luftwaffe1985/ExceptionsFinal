package Seminar3Final;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData(); // Create an object of ParsData class
        String newFileName = null; // Initialization of a variable
        WriteFile writeFile = new WriteFile(); // Create an object of WriteFile class

        HashMap<String, Object> data = parsData.parsInputData(); // Initialization of a dictionary
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } // Loop to enter data until the user enters the correct data

        newFileName = data.get("lastName") + ".txt"; // Specifies the file to write user data
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);
        // The WriteFile class method is called to write to the file

    }
}

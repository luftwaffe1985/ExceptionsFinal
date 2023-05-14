package Seminar3Final;

import java.util.Scanner;

public class InputData {
    public String[] inputData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a string separated by a SPACE (the string should contain full name, date of birth - dd.mm.yyyy, phone number - digits, sex - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("You haven't entered all the data, please try again");
            } else System.out.println("You've entered an excess data, please try again");
        }

    }
}

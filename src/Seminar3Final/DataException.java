package Seminar3Final;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Incorrect format: %s", i);
        System.out.println();
    }
}

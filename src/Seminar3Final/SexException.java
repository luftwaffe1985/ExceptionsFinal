package Seminar3Final;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Incorrect data: %s", i);
        System.out.println();
    }
}

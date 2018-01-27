package class_practice.lectii_frecventa;

public class NotStartedException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Exceptia proprie, cursul trebuie pornit !";
    }
}

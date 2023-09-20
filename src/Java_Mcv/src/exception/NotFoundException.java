package Java_Mcv.src.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException() {

    }

    public void getMessage(String strs) {
        System.out.println(strs);
    }
}

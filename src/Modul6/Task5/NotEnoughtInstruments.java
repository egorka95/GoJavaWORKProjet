package Modul6.Task5;

/**
 * Created by nikitarozhkov on 10.06.16.
 */
public class NotEnoughtInstruments extends Exception {
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    NotEnoughtInstruments(String message){
        this.message = message;
    }
}

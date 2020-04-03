package io.julian.exception;


/**
 * created by julian
 */
public class IllegalInputException extends RuntimeException {


    public IllegalInputException(String message) {
        super("Invalid Input. " + message);
    }


}

package racingcar.utils;

public class Converter {

    public static final String NOT_NUMBER_EXCEPTION_MESSAGE = "정수만 입력 가능합니다.";

    private Converter() {
    }

    public static Long convertStringToLong(String target) {
       try {
           return Long.parseLong(target);
       } catch(NumberFormatException exception) {
           throw new IllegalArgumentException(NOT_NUMBER_EXCEPTION_MESSAGE);
       }
    }
}
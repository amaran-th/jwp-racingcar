package racingcar.dto;

public class ExceptionResponse {

    private final boolean success = false;
    private final int type;
    private final String message;

    public ExceptionResponse(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public int getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
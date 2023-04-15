package Group.A.File.System.message;

public class ResponseMessage{
    private String message;

    public ResponseMessage(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public String setMessage(String message) {
        this.message = message;
    }
}
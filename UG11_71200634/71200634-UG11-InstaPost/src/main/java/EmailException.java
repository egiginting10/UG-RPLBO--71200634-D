public class EmailException {
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode){

    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
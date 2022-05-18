public class EmailExecption {
    private String errorMessage;
    private int errorCode;

    public EmailExecption(int errorCode) {
        if (errorCode == 1) {
            this.errorMessage = "Error : Login gagal! Email yang Anda masukkan tidak valid.";
        }
        else if (errorCode == 2) {
            this.errorMessage = "Error : Login gagal! Email Anda tidak terdaftar di Google.";"
        }
    }
    public String getErrorMessage() { return this.errorMessage; }
}


public class UsernameException extends Exception{
    private int errCode;
    private String errMessage;

    public UsernameException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="username tidak boleh kosong";
        }else if(this.errCode==2){
            errMessage="username minimal 6 karakter";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}

public class LoginException extends Exception{
    private int errCode;
    private String errMessage;

    public LoginException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="username tidak boleh kosong";
        }else if(this.errCode==2){
            errMessage="password tidak boleh kosong";
        }
        else if(this.errCode==3){
            errMessage="username atau password salah!";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
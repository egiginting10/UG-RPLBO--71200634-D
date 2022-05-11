public class PasswordException extends Exception{
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="password tidak boleh kosong";
        }else if(this.errCode==2){
            errMessage="password minimal 7 karakter";
        }else if(this.errCode==3){
            errMessage="password harus mengandung huruf kecil, huruf besar, angka, dan simbol";
        }else if(this.errCode==4){
            errMessage="password tidak boleh sama dengan username";
        }else if(this.errCode==5){
            errMessage="konfirmasi password tidak sama";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
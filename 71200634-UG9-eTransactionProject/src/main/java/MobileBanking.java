package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(nominal<0){
            System.out.println("Input tidak valid");
        }else if(super.getSaldo()<nominal){
            System.out.println("gagal");
        }else if(isCheckFee()==true){
            super.setSaldo(dp.getSaldo()-(this.feeAntarBank+nominal));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }

    }

    public boolean isCheckFee(){

    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

}
package com.ug9.etransactionproject;

public class MobileBanking {
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(nominal<0){
            System.out.println("Input tidak valid");
        }else if(super.getSaldo()<nominal){
            System.out.println("gagal");
        }else if(isCheckFee()==true){
            super.setSaldo(dp.getSaldo()-(this.feeAntarBank+nominal));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }

    }

    public boolean isCheckFee(){

    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

}

}

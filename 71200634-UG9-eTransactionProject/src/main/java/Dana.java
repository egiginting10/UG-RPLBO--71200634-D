public class Dana extends MobileWallet{
    private long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal){
        setFeeTransferBank(danaFeeTransferBank);
    }
}
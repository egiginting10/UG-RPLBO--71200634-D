public class BRImo extends MobileBanking{
    public BRImo(String nama, long saldo, String noRekening){
        super(nama, saldo, noRekening);
    }
    @Override
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal) {
        if (dp instanceof BRImo){
            setCheckFee(false);
        }
        else {
            setCheckFee(true);
        }
    }
}
import com.ug7.ewallet.Main;
import com.ug7.ewallet.user;

public class ShopeePay extends Ewallet {
    private int feeTopup = 500;
    private int feeTransfer = 0;
    private int feeWithdraw = 1000;

    public ShopeePay(User user) {
        super(user);
    }

    public void topup(int jumlah) {
        if (jumlah + this.feeTransfer > super.getUser().getUang()) {
            jumlah += this.feeTransfer;
            System.out.println("Maaf, uang cash kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            super.topup(jumlah);
            this.pay(this.feeTransfer);
        }
    }

    public void transfer(GoPay Ewallet, int jumlah) {
        if (!super.getUser().isEmailConfirmed()) {
            System.out.println("Halo, " + this.getUser().getNama() + "! Silakan konfirmasi email terlebih dahulu!");
        } else {
            System.out.println("Transfer saldo akan terkena potongan fee " + Main.formatRupiah(this.feeTransfer));
            System.out.print("Transfer sedang diproses");
            Main.tunggu(3);
            if (jumlah + this.feeTransfer > super.getSaldo()) {
                jumlah += this.feeTransfer;
                System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
            } else {
                super.transfer(Ewallet, jumlah);
                this.pay(this.feeTransfer);
            }
        }
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw saldo akan terkena potongan fee " + Main.formatRupiah(this.feeWithdraw));
        if (jumlah + this.feeWithdraw > super.getSaldo()) {
            jumlah += this.feeWithdraw;
            System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            System.out.println("Halo, " + this.getUser().getNama() + "! Uang cash sejumlah " + Main.formatRupiah(jumlah) + " telah masuk ke dompetmu!");
            super.withdraw(jumlah);
            this.pay(this.feeWithdraw);
        }
    }

    public void getInfo() {
        System.out.println("[ShopeePay e-Wallet]");
        super.getInfo();
    }

}

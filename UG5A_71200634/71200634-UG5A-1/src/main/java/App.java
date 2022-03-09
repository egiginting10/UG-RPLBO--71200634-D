public class App {
    public static void main(String[] args) {
        TransPay userA = new TransPay();
        userA.setNama("Lukas Graham");
        userA.setSaldo(1000000);
        Keyboard keyA = new Keyboard();
        keyA.setMerkModel("Digital Alliance Meca Fighter Ice TKL SE");
        keyA.setHarga(310000);
        Keyboard keyB = new Keyboard();
        keyB.setMerkModel("Logitech K120");
        keyB.setHarga(94000);
        System.out.println("==========Skenario 1: Top Up Saldo==========");
        System.out.println("Nominal Anda tidak valid! Nominal harus lebih dari 0");
        System.out.println("Top up sebesar Rp 120000 berhasil");
        userA.topUp(-50000);
        userA.topUp(120000);
        System.out.println("===> Total saldo "+userA.getNama()+": "+"Rp "+userA.getSaldo());
        System.out.println("\n==========Skenario 2: Pembelian Keyboard==========");
        System.out.println("\n"+userA.getNama()+" melakukan pembelian...\n");
        userA.bayar(-5,keyA);
        userA.bayar(1,keyA);
        userA.bayar(2,keyB);
        userA.bayar(5,keyA);
        System.out.println("===> Total saldo "+userA.getNama()+": "+"Rp "+userA.getSaldo());
    }
}

package com.ug7.ewallet;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        user U_71190480 = new user("Egi Granaldi", "egi.granaldi@ti.ukdw.ac.id",50000);
        user U_71200634 = new user("Egi Granaldi ", "egi.granaldi@ti.ukdw.ac.id", 30000);

        ShopeePay E_71190480 = new ShopeePay(U_71190480);
        GoPay E_71200634 = new GoPay(U_71200634);

        System.out.println("\n========== AWAL ==========");
        E_71190480.getInfo();
        E_71200634.getInfo();

        System.out.println("\n========== TOP UP #1 ==========");
        System.out.print("["+E_71200634.getUser().getNama()+"] - ");
        E_71200634.topup(10000);

        System.out.println("\n========== TOP UP #2 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.topup(5000);

        System.out.println("\n========== TOP UP #3 ==========");
        System.out.print("["+E_71200634.getUser().getNama()+"] - ");
        E_71200634.topup(50000);
        System.out.print("["+E_71200634.getUser().getNama()+"] - ");
        E_71200634.topup(9000);

        System.out.println("\n========== TRANSFER #1 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.transfer(E_71200634, 2500);

        System.out.println("\n========== KONFIRMASI EMAIL ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.getUser().emailConfirmation();

        System.out.println("\n========== TRANSFER #2 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.transfer(E_71200634, 2500);

        System.out.println("\n========== TRANSER #3 ==========");
        System.out.print("["+E_71200634.getUser().getNama()+"] - ");
        E_71200634.transfer(E_71190480, 9500);

        System.out.println("\n========== WITHDRAW #1 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.withdraw(11000);
        System.out.print("["+E_71200634.getUser().getNama()+"] - ");
        E_71200634.withdraw(1100);

        System.out.println("\n========== AKHIR ==========");
        E_71190480.getInfo();
        E_71200634.getInfo();
    }

    public static void tunggu(int detik)
    {
        try
        {
            for (int i = 0; i < detik; i++) {
                System.out.print(".");
                if(i == detik-1) System.out.println();
                Thread.sleep(detik * 1000);
            }
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static String formatRupiah(int nominal) {
        String str = String.valueOf(nominal);
        Double rupiah = Double.parseDouble(str);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(rupiah);
    }
}

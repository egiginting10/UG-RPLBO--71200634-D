import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int harga,jumlah, total, diskon;

        System.out.print("Masukkan Jumlah Barang : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan Harga Barang : ");
        harga = input.nextInt();


        total = jumlah * harga;

        if (total >= 101000) {
            diskon = (total *  5) / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%\n");

        }else if(total <= 200000) {
            diskon = (total * 5) / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%\n");

        }else if(total >= 201000){
            diskon = (total * 10) / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%\n");
        }else if(total <= 400000){
            diskon = (total * 10) / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%\n");
        }else if(total > 400000){
            diskon = (total * 20) / 100;
            total = total - diskon;
            System.out.println("Diskon = 20%\n");
        }else if(total < 100000){
            diskon = (0) / 100;
            total = total - diskon;
            System.out.println("Diskon = 0%\n");
        }

        if (jumlah >= 0){
            System.out.println("Tambahan Diskon \n Total Bayar = " +total);
        }
        else{
            System.out.println("Total Bayar = "+total);
        }
    }
}

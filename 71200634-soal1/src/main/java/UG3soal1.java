import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        String nama, tglkadaluarsa;
        int quantity, berat;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("=============== Pendataan Karyawan Data Product ===============");
        System.out.println("Masukkan Data Product Makanan Anda");
        System.out.print("Nama Makanan: ");
        nama = keyboard.nextLine();
        System.out.print("Tanggal Kadaluarsa: ");
        tglkadaluarsa = keyboard.nextLine();
        System.out.print("Jumlah (Quantity): ");
        quantity = keyboard.nextInt();
        System.out.print("Berat (gram): ");
        berat = keyboard.nextInt();

        System.out.println("=============== Data Product ===============");
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Tanggal Kadaluarsa: " + tglkadaluarsa);
        System.out.println("Jumlah (Quantity): " + quantity );
        System.out.println("Berat (gram): " + berat);
        System.out.println("============================================");
    }

}

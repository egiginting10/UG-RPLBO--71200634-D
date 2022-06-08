package com.ug14.rumahsakit;

import java.sql.*;
import java.util.Scanner;

public class Pelayanan extends DAO{
    private int idPelayan;
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) throws SQLException {
        if(!pasien.getStatus()){
            jadwal.setDokter(dokter);
            jadwal.setPasien(pasien);
            jadwal.setStatusDaftar(true);
            jadwal.setPelayanan(this);

            int idPemeriksa = jadwal.getIdPemeriksaan();
            int rm = pasien.getRm();
            int iddokter = dokter.getIdDokter();
            int idpelayan = this.idPelayan;
            int status = 1;
            String url = "jdbc:mysql://localhost:3306/rumahsakit";
            try {

                Connection conn = DriverManager.getConnection(url,"root","");
                Statement statement = conn.createStatement();
                int rs = statement.executeUpdate("INSERT INTO jadwal values ('"+idPemeriksa+"','"+rm+"','"+iddokter+"','"+idpelayan+"','"+status+"')");

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

    public Pasien registrasi() throws SQLException {
        Scanner inp12 = new Scanner(System.in);
        System.out.print("RM : ");
        int RM = inp12.nextInt();

        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaPengunjung = inp.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        int usiaPengunjung= inp.nextInt();

        Scanner inp2 = new Scanner(System.in);

        System.out.print("Masukkan alamat anda : ");
        String alamatPengunjung= inp2.nextLine();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitPengunjung = inp3.nextLine();

        Pasien pasien = new Pasien(RM,namaPengunjung,usiaPengunjung,alamatPengunjung,penyakitPengunjung);
        super.inputPasien(pasien);
        System.out.println("Proses Registrasi Anda Berhasil!");
        return pasien;
    }


    public int getIdPelayan() {
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

package TokoLaundry;

import java.util.Scanner;

public class Transaksi {

    String kodeLaundry, tanggalMasuk, tanggalSelesai, note, tipeLaundry;
    int hargaKiloan = 5000;
    Pelanggan pelanggan;
    double beratKilo, totalHarga;

    Scanner inputTransaksi = new Scanner(System.in);

    void addNewTransaksi(Pelanggan pelanggan){

        this.pelanggan = pelanggan;

        System.out.println();
        System.out.println("Tambah Transaksi Baru");
        System.out.println("Pelanggan : " +pelanggan.namaLengkap);

        System.out.print("Tipe Laundry : ");
        tipeLaundry= inputTransaksi.nextLine();

        System.out.print("Harga Kiloan : ");
        hargaKiloan= inputTransaksi.nextInt();

        System.out.print("Tanggal Masuk : ");
        tanggalMasuk = inputTransaksi.next();

        System.out.print("Tanggal Selesai : ");
        tanggalSelesai= inputTransaksi.next();

        System.out.print("Berat (Kilo) : ");
        beratKilo = inputTransaksi.nextDouble();

        System.out.print("Note : ");
        note = inputTransaksi.next();


        kodeLaundry = pelanggan.nickname+"-"+tipeLaundry+"-"+hargaKiloan+"-"+beratKilo;

        totalHarga = beratKilo * hargaKiloan;

    }
    void cetakNota(){
        System.out.println();
        System.out.println("========+++=========");
        System.out.println("Nota Transaksi");
        System.out.println("Kode Laundry : " + kodeLaundry);
        System.out.println("Pelanggang : " + pelanggan.namaLengkap+ " (" + pelanggan.nickname + ") ");
        System.out.println("Alamat : " + pelanggan.alamat);
        System.out.println("Tanggal Masuk : " + tanggalMasuk);
        System.out.println("Tanggal Selesai : " + tanggalSelesai);
        System.out.println("====================");
        System.out.println("Tipe Laundry :" + tipeLaundry);
        System.out.println("Berat : " + beratKilo + "Kg");
        System.out.println("Harga Total : " + totalHarga + "(" + hargaKiloan+"/Kg)");
        System.out.println("Catatan Lainnya : " + note);
        System.out.println("========+++=========");

    }


}

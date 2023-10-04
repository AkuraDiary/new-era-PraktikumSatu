package TokoLaundry;

import java.util.Scanner;

public class Pelanggan {

    String kodePelanggan, nickname, namaLengkap, noTelp, alamat, jenisKelamin;
    int umur;


    Scanner inputPelanggan = new Scanner(System.in);
    public void daftarPelangganBaru(){

        System.out.println("Input Data Pelanggan");

        System.out.print("Nama Lengkap : ");
        namaLengkap = inputPelanggan.nextLine();

        System.out.print("Nama Panggilan : ");
        nickname = inputPelanggan.nextLine();

        System.out.print("Jenis Kelamin : ");
        jenisKelamin = inputPelanggan.nextLine();

        System.out.print("No Telp : ");
        noTelp = inputPelanggan.nextLine();

        System.out.print("Umur : ");
        umur = inputPelanggan.nextInt();

        System.out.print("Alamat : ");
        alamat = inputPelanggan.next();

        kodePelanggan = "PpP-"+nickname+umur+"-"+noTelp;

    }

    public void cetakDataPelanggan(){
        System.out.println();
        System.out.println("Cetak Data Pelanggan");
        System.out.println("Kode Pelanggan : " + kodePelanggan);
        System.out.println("Nama : " + namaLengkap + " (" + nickname + ")");
        System.out.println("Umur : " + umur);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("No Telp : " + noTelp);
        System.out.println("Alamat : " + alamat);
        System.out.println();
    }

}

package TokoRetail;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Barang {
    //Atribut
    String kodeBarang, namaBarang, produsen;
    int beratBersih, hargaBeli, hargaJual;

    public int stok = 1;
    public String tanggalKadaluarsa;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);

    public void inputData() {
        try {
            String temp = "";
            System.out.println("Inputan Data Barang ");

            System.out.print("Kode : ");
            kodeBarang = input.readLine();

            System.out.print("Nama : ");
            namaBarang = input.readLine();

            System.out.print("Produsen  : ");
            produsen = input.readLine();

            System.out.print("Berat Bersih : ");
            temp = input.readLine();
            beratBersih = Integer.parseInt(temp);

            System.out.print("Harga Beli   : ");
            temp = input.readLine();
            hargaBeli = Integer.parseInt(temp);

            System.out.print("Harga Jual   : ");
            temp = input.readLine();
            hargaJual = Integer.parseInt(temp);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void viewData() {
        System.out.println("Menampilkan detil barang");
        System.out.println("Nama : " + namaBarang);
        System.out.println("Kode : " + kodeBarang);
        System.out.println("Produsen : " + produsen);
        System.out.println("Berat Bersih : " + beratBersih);
        System.out.println("Harga Beli : " + hargaBeli);
        System.out.println("Harga Jual : " + hargaJual);
    }
}
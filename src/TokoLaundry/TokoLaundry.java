package TokoLaundry;

public class TokoLaundry {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.daftarPelangganBaru();

        pelanggan.cetakDataPelanggan();

        Transaksi transaksi = new Transaksi();
        transaksi.addNewTransaksi(pelanggan);
        transaksi.cetakNota();

    }
}

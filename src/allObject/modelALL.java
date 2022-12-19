package allObject;

import controller.controller_kasir;
import model.data_barang;
import model.data_detTransaksi;
import model.data_kasir;
import model.data_transaksi;

public class modelALL {
    public static data_barang DatabaseBarang = new data_barang();
    public static data_kasir DatabaseKasir = new data_kasir();
    public static data_transaksi DatabaseTransaksi = new data_transaksi();
    public static data_detTransaksi DatabaseDetTransaksi = new data_detTransaksi();
    public static controller_kasir controllerKasir = new controller_kasir();
}

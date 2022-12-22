package viewCLI;

import entity.entity_barang;

import java.util.ArrayList;

public class barang {
    public static void view(ArrayList<entity_barang> barangs){
        for (entity_barang barang:barangs){
            System.out.println("id barang : "+barang.id);
            System.out.println("nama barang : "+barang.nama_barang);
            System.out.println("harga barang : "+barang.harga);
            System.out.println("stok barang : "+barang.stok);
        }
    }
}

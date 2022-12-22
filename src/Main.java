import allObject.modelALL;
import entity.entity_barang;
import viewCLI.kasir;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        modelALL.DatabaseBarang.create(
                new entity_barang(1,"sabun",5000,20));
        modelALL.DatabaseBarang.create(
                new entity_barang(2,"sikat",3000,2));
        ArrayList<entity_barang> barangs = modelALL.DatabaseBarang.read();
//        System.out.println(barangs);
        viewCLI.barang.view(barangs);
        entity_barang barang = modelALL.DatabaseBarang.search_by_id(1);
        System.out.println(barang.nama_barang);
        entity_barang barang_temp = new entity_barang(1,"detergen",8000,17);
        modelALL.DatabaseBarang.update(barang_temp, 1);
        ArrayList<entity_barang> barangs1 = modelALL.DatabaseBarang.read();
        viewCLI.barang.view(barangs1);

        System.out.println("=============");
        modelALL.DatabaseBarang.delete(2);
        ArrayList<entity_barang> barangs2 = modelALL.DatabaseBarang.read();
        viewCLI.barang.view(barangs2);
    }
}
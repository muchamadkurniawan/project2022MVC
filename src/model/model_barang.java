package model;

import abstraction.interface_model_barang;
import entity.entity_barang;

import java.util.ArrayList;

public class model_barang implements interface_model_barang {
    ArrayList <entity_barang> DB_barang = new ArrayList<entity_barang>();
    @Override
    public void create(entity_barang barang) {
        this.DB_barang.add(barang);
    }

    private int getIndexById(int id){
        for (int i=0; i<this.DB_barang.size();i++){
            if (id == this.DB_barang.get(i).id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void update(entity_barang barang, int id) {
        entity_barang barang1 = search_by_id(id);
        int index = this.getIndexById(id);
        this.DB_barang.get(index).nama_barang = barang.nama_barang;
        this.DB_barang.get(index).harga = barang.harga;
        this.DB_barang.get(index).stok = barang.stok;
    }

    @Override
    public void delete(int id) {
        int index = this.getIndexById(id);
        this.DB_barang.remove(index);
    }

    @Override
    public ArrayList<entity_barang> read() {
        return this.DB_barang;
    }

    @Override
    public entity_barang search_by_id(int id) {
        entity_barang barang= null;
        for(entity_barang brg:this.DB_barang){
            if (brg.id == id){
                return brg;
            }
        }
        return barang;
    }
}

package controller;

import abstraction.interface_kasir;
import entity.entity_kasir;
import java.util.ArrayList;
import allObject.*;
import helper.returnIndexnBool;


public class controller_kasir implements interface_kasir {
    @Override
    public ArrayList<entity_kasir> read() {
        return modelALL.DatabaseKasir.read();
    }

    @Override
    public boolean create(entity_kasir kasir) {
        try {
            modelALL.DatabaseKasir.create(kasir);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean update(entity_kasir kasir, int idKasir) {
        boolean cek = modelALL.DatabaseKasir.update(
                kasir.getNip(),kasir.getNama(), kasir.getPass());
        return cek;
    }

    @Override
    public boolean delete(int idKasir) {
//        return false;
        boolean cek = false;
        if (true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public entity_kasir findByID(int idKasir) {
        entity_kasir tempKasir = null;
        returnIndexnBool search = modelALL.DatabaseKasir.search(idKasir);
        if (search.cek){
            tempKasir = modelALL.DatabaseKasir.read().get(search.index);
        }
        return tempKasir;
    }
}

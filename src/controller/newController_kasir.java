package controller;

import abstraction.interface_kasir;
import entity.entity_kasir;

import java.util.ArrayList;

public class newController_kasir implements interface_kasir {
    @Override
    public ArrayList<entity_kasir> read() {
        return null;
    }

    @Override
    public boolean create(entity_kasir kasir) {
        return false;
    }

    @Override
    public boolean update(entity_kasir kasir, int idKasir) {
        return false;
    }

    @Override
    public boolean delete(int idKasir) {
        return false;
    }

    @Override
    public entity_kasir findByID(int idKasir) {
        return null;
    }
}

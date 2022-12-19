package abstraction;

import entity.entity_kasir;

import java.util.ArrayList;

public interface interface_kasir {
    ArrayList<entity_kasir> read();
    boolean create(entity_kasir kasir);
    boolean update(entity_kasir kasir, int idKasir);
    boolean delete(int idKasir);
    entity_kasir findByID(int idKasir);
}

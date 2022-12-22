package abstraction;

import entity.entity_barang;

import java.util.ArrayList;

public interface interface_model_barang {
    void create(entity_barang barang);
    void update(entity_barang barang, int id);
    void delete(int id);
    ArrayList<entity_barang> read();
    entity_barang search_by_id(int id);
}

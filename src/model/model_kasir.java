package model;
import entity.entity_kasir;
import helper.returnIndexnBool;

import java.util.ArrayList;

public class model_kasir {
    private ArrayList<entity_kasir> data_kasir;

    public model_kasir()
    {
        data_kasir = new ArrayList<entity_kasir>();
    }

    public void create(entity_kasir kasir)
    {
        this.data_kasir.add(kasir);
    }

    public ArrayList<entity_kasir> read()
    {
        return data_kasir;
    }

    public returnIndexnBool search(int nip)
    {
        int id = -1;
        boolean cek = false;
        for (int i=0;i<this.data_kasir.size();i++)
        {
            if (nip == this.data_kasir.get(i).getNip())
            {
                id = i;
                cek = true;
            }
        }
        returnIndexnBool idBol = new returnIndexnBool(cek, id);
        return idBol;
    }

    public boolean update(int nip, String nama, String pass)
    {
        returnIndexnBool IdBool = search(nip);
        if (IdBool.cek == true)
        {
            this.data_kasir.get(IdBool.index).setPass(pass);
            this.data_kasir.get(IdBool.index).setNama(nama);
            return true;
        }
        return false;
    }

    public void delete(int nip)
    {
//        int index = this.search(nip);
//        if (index == -1)
//        {
//            System.out.println("data tidak ditemukan");
//        }
//        else
//        {
//            this.data_kasir.remove(index);
//            System.out.println("data dengan NIP "+index +" berhasil dihapus");
//        }
    }
    private int cek_login(int nip, String pass)
    {
        for (int i=0;i<this.data_kasir.size();i++)
        {
            if (nip==this.data_kasir.get(i).getNip())
            {
                if (pass.equals(this.data_kasir.get(i).getPass()))
                {
                    return this.data_kasir.get(i).getNip();
                }
            }
        }
        return -1;
    }

    public int login(int nip, String pass)
    {
        int nipKasir = this.cek_login(nip,pass);
        if (nipKasir == -1)
        {
            System.out.println("NIP "+nip +" login gagal");
        }
        else
        {
            System.out.println("NIP "+nip +" login berhasil");
        }
        return nipKasir;
    }
}

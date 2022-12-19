package entity;

public class entity_kasir {
    private String nama;
    private int nip;
    private String pass;

    public entity_kasir(String nama, int nip, String pass) {
        this.nama = nama;
        this.nip = nip;
        this.pass = pass;
    }

    public String getNama() {
        return nama;
    }

    public int getNip() {
        return nip;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

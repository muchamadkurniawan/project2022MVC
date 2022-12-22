package viewCLI;

import allObject.modelALL;
import controller.controller_kasir;
import entity.entity_kasir;
import java.util.ArrayList;
import java.util.Scanner;

public class kasir {
    public static void view(){
        System.out.println("=== MENU CETAK DATA ===");
//        controller_kasir obj = new controller_kasir();
//        ArrayList<entity_kasir> EKasir = obj.read();
        ArrayList<entity_kasir> EKasir = modelALL.controllerKasir.read();
        if (EKasir== null){
            System.out.println("data kosong");
        } else {
            for (int i=0 ; i<EKasir.size() ; i++) {
                System.out.println("nama kasir : "+EKasir.get(i).getNama());
                System.out.println("ID kasir : "+EKasir.get(i).getNip());
                System.out.println("pass kasir : "+EKasir.get(i).getPass());
                System.out.println("");
            }
        }
    }
    public static void create(){
        System.out.println("=== MENU INSERT ===");
        Scanner scan = new Scanner(System.in);
        int nip=0;
        String nama="",pass = "";
        try{
            System.out.print("masukkan nip kasir : ");
            nip = scan.nextInt();
            System.out.print("masukkan nama kasir : ");
            nama = scan.next();
            System.out.print("masukkan password : ");
            pass = scan.next();
//            controller_kasir obj = new controller_kasir();
//            obj.create(new entity_kasir(nama, nip, pass));
            boolean err = modelALL.controllerKasir.create(new entity_kasir(nama, nip, pass));
            System.out.println("data berhasil masuk");
        } catch (Exception e) {
            System.out.println(e);
            System.out.printf("data gagal dimasukkan");
        }
    }

    public static void update(){
        System.out.println("=== MENU UPDATE ===");
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan nip kasir : ");
        int nip = scan.nextInt();
        System.out.print("masukkan nama kasir : ");
        String nama = scan.next();
        System.out.print("masukkan pass kasir : ");
        String pass = scan.next();
        entity_kasir tempKasir = new entity_kasir(nama, nip,  pass);
        boolean err = modelALL.controllerKasir.update(tempKasir, nip);
        if (err!=false){
            System.out.println("Data berhasil update");
        } else {
            System.out.println("data gagal update");
        }
    }

//    public static void login(){
//        int id = 123;
//        String pass = "kurniawan";
//        entity_kasir kasir = modelALL.controllerKasir.findByID(123);
//        if (kasir != null){
//            kasir.getPass() ==
//        }
//    }
}

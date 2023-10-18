package com.tutorial;

class Polos {
    String dataString;
    int dataInteger;
}

class Mahasiswa {
    String nama;
    String nim;
    String prodi;


    //  membuat konstruktor
    // Mahasiswa() {
    //      System.out.println("Ini Adalah konstruktor");
        
    //     }

         // membuat konstruktor dengan parameter
     Mahasiswa(String inputNama, String inputNIM, String inputProdi) {
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;

        System.out.println("Nama : " + nama);
        System.out.println("Nama : " + nim);
        System.out.println("Nama : " + prodi);
        


     }
}

public class Main {
  public static void main(String[] args) {
    //  Polos pls = new Polos();
    //        pls.dataString = "polos";
    //        pls.dataInteger = 10;


    //        System.out.print("isi data String;"+ pls.dataString);
    //        System.out.print("isi data String; "+ pls.dataInteger);  

 new Mahasiswa("Restu Ananta", "22241006", "PTI");
}
}
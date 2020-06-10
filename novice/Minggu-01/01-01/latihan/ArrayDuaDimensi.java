package com.array;

public class ArrayDuaDimensi {
    static void ucapSalam(){
        System.out.println("Selamat pagi");
    }
    public static void main(String[] args) {
        ucapSalam();
        String[] [] kontak = {{"Fatan", "0011"},
                              {"Ada",   "0022"},
                              {"Dedi",  "0033"},
                              {"Ora",   "0044"}};
        for (int x = 0; x < kontak.length; x++){
            System.out.println("Nama  : " + kontak[x][0]);
            System.out.println("Nomor : "  + kontak[x][1]);
            System.out.println("-----------------------");
        }
    }
}

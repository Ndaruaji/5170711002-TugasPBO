package pbo7;

import java.util.Scanner;

public class Manusia {

    protected String nama;
    Scanner input = new Scanner(System.in);

    public void pergi() {
        System.out.print("nama : ");
        nama = input.next();
        System.out.println("sudah menikah");
        System.out.println("punya satu istri");
        System.out.println("sudah menikah selama lima tahun");
        System.out.println("sudah memiliki dua anak");

    }
public void nama(){
    System.out.println("nama istri : elz");
}
public void namaanak(){
    System.out.println("nama anak 1: abdun");
    System.out.println("nama anak 2: siti");
}
}

package mayinTarlasOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column;
        System.out.println("Mayin Tarlasi oyununa Hosgeldiniz");
        System.out.println("Lutfen oyunun boyutlarini giriniz");
        //System.out.println("satir sayisi : ");
        row= sc.nextInt();
        //System.out.println("Sutun sayisi : ");
        column= sc.nextInt();
        MayinTarlasi mayin=new MayinTarlasi(row, column);
        mayin.run();

    }

}

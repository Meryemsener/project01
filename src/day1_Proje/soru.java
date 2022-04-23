package day1_Proje;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("gunlerden birinin bas harfini giriniz");
        char harf=sc.next().charAt(0);

        if(harf=='p'){
            System.out.println("Pazartesi, pazar,persembe");
        }else if(harf=='s'){
            System.out.println("sali");
        }else if(harf=='c'){
            System.out.println("cuma, cumartesi");
        }else System.out.println("hatali giris");
    }
}

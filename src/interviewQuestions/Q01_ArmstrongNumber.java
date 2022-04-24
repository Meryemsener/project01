package interviewQuestions;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
     public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          System.out.print("Bir sayi giriniz :");
          int sayi = scan.nextInt();
          armstrongSayi(sayi);
          girilenSayiyaKadar(sayi);
     }
     private static void girilenSayiyaKadar(int sayi) {
          for (int i = 0; i<=sayi ; i++) {
               armstrongSayi(i);
          }
     }
     public static void armstrongSayi(int sayi) {
          int kupToplami = 0;
          int basamak = 0;
          int girilenSayi = sayi;
          while (sayi > 0) {
               basamak = sayi % 10;
               kupToplami += (basamak * basamak * basamak * basamak);
               sayi = sayi / 10;
          }
          if (girilenSayi == kupToplami) {
               System.out.println("girdigniz sayi armstrong sayidir");
          } else System.out.println(girilenSayi + " armstrong sayi degildir");


     }
     }


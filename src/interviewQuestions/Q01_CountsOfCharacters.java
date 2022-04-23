package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacters {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String cumle = sc.nextLine();
        //her karakteri ayri ayri yazdirmak icin split kullaniyoruz
        String[] arr=cumle.split("");
        //ayrilmis bu cumleleri konsol'a yazdirmak icin
        System.out.println(Arrays.toString(arr));
        //harfleri alfabetik olarak siralamak icin sort kullanilir.siralama yapmadigimizda her harfi ayri ayri 1 diye yazar.
        //a harfi bir defa
        //b harfi 1 defa
        //a harfi bir defa seklinde
       Arrays.sort(arr);
        //siraladigimizin harfleri ekrana yazdirmak icin
        System.out.println(Arrays.toString(arr));
        //harflerin kacar defa tekrar ettigini hafizada toplamasi icin bir konteynir
        int counter=0;
        //arrayin icine girip harfleri teker teker saymasi icin for loop
        for(int i=1; i<arr.length; i++){
            //if sarti koyalim. Eger i=1 ile i-1 birbirine esit ise countera at
            if(arr[i-1].equals(arr[i])){
                counter++;
            }else{//degilse counter'a atma
                System.out.println(arr[i-1]+" sayisi "+(counter+1));
                counter=0;

            }
            if(i==arr.length-1){//en sona geldiginde
                System.out.println(arr[i] + " sayisi " + (counter+1));

            }
        }

    }
}

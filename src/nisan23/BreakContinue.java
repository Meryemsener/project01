package nisan23;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        /*
        break; kosul saglanmadiginda donguyu durdurur
        continue=> donguyu durdurmaz ama bir sonraki aima gider
         */
        Scanner sc=new Scanner(System.in);
       /* int sayi;
        while(true){//dogru oldukca calis
            System.out.println("Bir sayi girinir");
            sayi=sc.nextInt();
            if(sayi==0){
                break;// 0'i bulana kadar yazdirir, 0'i bulunca durur
            }
            System.out.println(sayi);

        }*/
        for(int i=1;i<=10;i++){
            if(i==4 || i==9){
                System.out.println("atladi = "+i);
                continue;
                //eger i 4 veya 9 olursa onlari yazdirma ama kodu yazmaya devam et ,
                //yani bir sonraki adima gec
            }
            System.out.println("i = "+i);
        }


    }
}

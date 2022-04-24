package interviewQuestions;

import java.util.Scanner;

public class Q05_ForFlashBack_Q01 {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String cumle=sc.nextLine();
        System.out.println("Bir harf seciniz");
       String harf=sc.next();

        int count=0;
        for(int i=0; i<cumle.length(); i++){
            if(cumle.substring(i,i+1).equals(harf)){
                count++;
            }

        }
        System.out.println(harf + " harfi cumlede "+count+" kere kullanimlistir");

    }
    /*
    Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String cumle=sc.nextLine();
        System.out.println("Bir harf seciniz");
       char harf=sc.next().charAt(0);

        int count=0;
        for(int i=0; i<cumle.length(); i++){
            if(cumle.charAt(i)==harf){
                count++;
            }
        }
        System.out.println(harf + " harfi cumlede "+count+" kere kullanimlistir");

    }
     */


}

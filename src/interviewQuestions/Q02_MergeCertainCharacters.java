package interviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String kelime = sc.next();
        System.out.println("Bir sayi giriniz");
        int sayi = sc.nextInt();
        System.out.println(method(kelime, sayi));

    }

    private static String  method(String kelime, int sayi) {
        String str = kelime.substring(0, 1) + kelime.substring(kelime.length() - 1);
        String ilkSonHarf = "";
        for (int i = 1; i <= sayi; i++) {//ilk ve son harften girilen sayi kadar yazdirilsin istiyoruz
            ilkSonHarf += str;

        }
        //System.out.println(ilkSonHarf);
        return ilkSonHarf;
    }

}

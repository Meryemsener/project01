package Constructor;

import hesapMakinesi.HesapMakinesi1;
import maasHesaplama.Employee;

public class Main {
    public static void main(String[] args) {
       /* HesapMakinesi makine1;
        makine1 = new HesapMakinesi();
        makine1.sayi1=10;
        System.out.println(makine1.sayi1);
        */


        HesapMakinesi m1=new HesapMakinesi(10,5,"siyah");//birinci makine
        System.out.println(m1.toplama());
        System.out.println(m1.carpma());
        System.out.println(m1.bolme());
        System.out.println(m1.cikarma());

        HesapMakinesi m2=new HesapMakinesi(20,3,"mavi");//ikinci makine
        System.out.println(m2.toplama());
        System.out.println(HesapMakinesi.PI);


    }





}

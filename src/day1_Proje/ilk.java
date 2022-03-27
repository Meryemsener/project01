package day1_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ilk {
    public static void main(String[] args) {
        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */


        //1.adim// 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        String gunler[] = {"Pazartesi ", "Sali ", "Carsamba ", "Persembe ", "cuma ", " cumartesi", "Pazar"};
        List<String> gunlerListesi = new ArrayList<String>();
        for (String each : gunler
        ) {
            gunlerListesi.add(each);

        }
        System.out.println(gunlerListesi);
        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Double> gunlukKazanclar = new ArrayList<>();
        double toplamKazanc = 0;
        Double ortalamaKazanc = getOrtalamaKazanc(gunlerListesi, gunlukKazanclar, toplamKazanc) / gunlerListesi.size();
        System.out.println(toplamKazanc);
        List<String> ortalamaninUstundekiGünler = new ArrayList<>();
        getOrtalamaninUstundeKazancGünleri(gunlerListesi,gunlukKazanclar,ortalamaKazanc,ortalamaninUstundekiGünler);


    }

    private static void getOrtalamaninUstundeKazancGünleri(List<String> gunlerListesi, List<Double> gunlukKazanclar, Double ortalamaKazanc, List<String> ortalamaninUstundekiGünler) {
        for(int i=0; i<gunlerListesi.size();i++){
            if(gunlukKazanclar.get(i)>ortalamaKazanc){
                ortalamaninUstundekiGünler.add(gunlerListesi.get(i));
            }
            System.out.println(ortalamaninUstundekiGünler);




    }


}

    private static Double getOrtalamaKazanc(List<String> gunlerListesi, List<Double> gunlukKazanclar, double toplamKazanc) {
        int i = 0;

        while (i <= gunlerListesi.size()) {
            Scanner sc = new Scanner(System.in);
            System.out.println(gunlerListesi.get(i) + " gunune ait kazanci girin");
            double gunlukKazanc = sc.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            toplamKazanc += gunlukKazanc;
             i++;
        }
        return toplamKazanc;

       /* for(int i=0; i<gunlerListesi.size();i++){
            Scanner sc=new Scanner(System.in);
            System.out.println(gunlerListesi.get(i)+" gunune ait kazanci girin");
            double gunlukKazanc=sc.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            toplamKazanc+=gunlukKazanc;*/


    }

}
